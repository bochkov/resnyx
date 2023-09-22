package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to forward messages of any kind.
 * Service messages can't be forwarded.
 * On success, the sent Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class ForwardMessage implements TgMethod {

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
     * Sends the message silently. Users will receive a notification with no sound.
     */
    @JsonProperty("disable_notification")
    private Boolean disableNotification;

    /**
     * Protects the contents of the forwarded message from forwarding and saving
     */
    @JsonProperty("protect_content")
    private Boolean protectContent;

    /**
     * Message identifier in the chat specified in from_chat_id
     */
    @JsonProperty("message_id")
    private Long messageId;
}
