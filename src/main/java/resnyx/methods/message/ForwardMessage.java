package resnyx.methods.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.TgMethod;
import resnyx.Types;
import resnyx.model.Message;

/**
 * Use this method to forward messages of any kind. On success, the sent {@link Message} is returned.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class ForwardMessage extends TgMethod<Message> {

    public static final String METHOD = "forwardMessage";

    /**
     * Unique identifier for the target chat or username of the
     * target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Unique identifier for the chat where the original message was
     * sent (or channel username in the format @channelusername)
     */
    @JsonProperty("from_chat_id")
    private Long fromChatId;

    /**
     * Message identifier in the chat specified in from_chat_id
     */
    @JsonProperty("message_id")
    private Long messageId;

    /**
     * Optional. Sends the message silently. Users will receive a notification with no sound.
     */
    @JsonProperty("disable_notification")
    private Boolean disableNotification;

    public ForwardMessage(String token, Long chatId, Long fromChatId, Long messageId) {
        super(token);
        this.chatId = chatId;
        this.fromChatId = fromChatId;
        this.messageId = messageId;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference type() {
        return Types.MESSAGE;
    }
}
