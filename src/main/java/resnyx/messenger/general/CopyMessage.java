package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.Caption;
import resnyx.common.SendOptions;

/**
 * Use this method to copy messages of any kind. Service messages and invoice messages can't be copied.
 * A quiz poll can be copied only if the value of the field correct_option_id is known to the bot.
 * The method is analogous to the method forwardMessage, but the copied message doesn't have a link to the original message.
 * Returns the MessageId of the sent message on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class CopyMessage implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Unique identifier for the chat where the original message was sent (or channel username in the format @channelusername)
     */
    @JsonProperty("from_chat_id")
    private final String fromChatId;

    /**
     * Message identifier in the chat specified in from_chat_id
     */
    @JsonProperty("message_id")
    private final Long messageId;

    /**
     * New start timestamp for the copied video in the message
     */
    @JsonProperty("video_start_timestamp")
    private Integer videoStartTimestamp;

    @JsonUnwrapped
    private Caption caption;

    @JsonUnwrapped
    private SendOptions sendOptions;
}
