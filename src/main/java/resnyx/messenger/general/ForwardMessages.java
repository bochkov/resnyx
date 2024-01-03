package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

import java.util.List;

/**
 * Use this method to forward multiple messages of any kind.
 * If some of the specified messages can't be found or forwarded, they are skipped.
 * Service messages and messages with protected content can't be forwarded.
 * Album grouping is kept for forwarded messages.
 * On success, an array of MessageId of the sent messages is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class ForwardMessages implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Unique identifier for the target message thread (topic) of the forum; for forum supergroups only
     */
    @JsonProperty("message_thread_id")
    private Long messageThreadId;

    /**
     * Unique identifier for the chat where the original message was sent (or channel username in the format @channelusername)
     */
    @JsonProperty("from_chat_id")
    private final String fromChatId;

    /**
     * Identifiers of 1-100 messages in the chat from_chat_id to forward.
     * The identifiers must be specified in a strictly increasing order.
     */
    @JsonProperty("message_ids")
    private final List<Long> messageIds;

    /**
     * Sends the message silently. Users will receive a notification with no sound.
     */
    @JsonProperty("disable_notification")
    private Boolean disableNotification;

    /**
     * Protects the contents of the forwarded message from forwarding and saving
     */
    @JsonProperty("protect_content")
    private Boolean protectContent;

}
