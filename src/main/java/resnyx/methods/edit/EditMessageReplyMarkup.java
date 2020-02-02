package resnyx.methods.edit;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.Answer;
import resnyx.TgMethod;
import resnyx.Types;
import resnyx.model.InlineKeyboardMarkup;
import resnyx.model.Message;

/**
 * Use this method to edit only the reply markup of messages.
 * On success, if edited message is sent by the bot, the edited Message is returned,
 * otherwise True is returned.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class EditMessageReplyMarkup extends TgMethod<Message> {

    public static final String METHOD = "editMessageReplyMarkup";

    /**
     * Required if inline_message_id is not specified.
     * Unique identifier for the target chat or username of the target
     * channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Required if inline_message_id is not specified.
     * Identifier of the message to edit
     */
    @JsonProperty("message_id")
    private Long messageId;

    /**
     * Required if chat_id and message_id are not specified.
     * Identifier of the inline message
     */
    @JsonProperty("inline_message_id")
    private String inlineId;

    /**
     * A JSON-serialized object for a new inline keyboard.
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    public EditMessageReplyMarkup(String token, Long chatId, Long messageId) {
        super(token);
        this.chatId = chatId;
        this.messageId = messageId;
    }

    public EditMessageReplyMarkup(String token, String inlineId) {
        super(token);
        this.inlineId = inlineId;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference<Answer<Message>> type() {
        return Types.MESSAGE;
    }
}
