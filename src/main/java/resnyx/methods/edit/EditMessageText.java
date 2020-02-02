package resnyx.methods.edit;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.Answer;
import resnyx.ReplyMethod;
import resnyx.Types;
import resnyx.model.Message;

/**
 * Use this method to edit text and game messages. On success,
 * if edited message is sent by the bot, the edited Message is returned,
 * otherwise True is returned.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class EditMessageText extends ReplyMethod<Message> {

    public static final String METHOD = "editMessageText";

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
     * New text of the message
     */
    private String text;

    public EditMessageText(String token, Long chatId, Long messageId, String text) {
        super(token);
        this.chatId = chatId;
        this.messageId = messageId;
        this.text = text;
    }

    public EditMessageText(String token, String inlineId, String text) {
        super(token);
        this.inlineId = inlineId;
        this.text = text;
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
