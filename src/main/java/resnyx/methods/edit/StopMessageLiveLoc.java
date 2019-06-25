package resnyx.methods.edit;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.TgMethod;
import resnyx.Types;
import resnyx.model.InlineKeyboardMarkup;
import resnyx.model.Message;

/**
 * Use this method to stop updating a live location message before live_period expires.
 * On success, if the message was sent by the bot, the sent Message is returned, otherwise True is returned.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class StopMessageLiveLoc extends TgMethod<Message> {

    public static final String METHOD = "stopMessageLiveLocation";

    /**
     * Required if inline_message_id is not specified.
     * Unique identifier for the target chat or username of the
     * target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Required if inline_message_id is not specified.
     * Identifier of the message with live location to stop
     */
    @JsonProperty("message_id")
    private Long messageId;

    /**
     * Required if chat_id and message_id are not specified. Identifier of the inline message
     */
    @JsonProperty("inline_message_id")
    private String inlineId;

    /**
     * Optional. A JSON-serialized object for a new inline keyboard.
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference type() {
        return Types.MESSAGE;
    }
}
