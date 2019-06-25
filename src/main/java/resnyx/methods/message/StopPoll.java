package resnyx.methods.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.TgMethod;
import resnyx.Types;
import resnyx.model.InlineKeyboardMarkup;
import resnyx.model.Poll;

/**
 * Use this method to stop a poll which was sent by the bot.
 * On success, the stopped Poll with the final results is returned.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class StopPoll extends TgMethod<Poll> {

    public static final String METHOD = "stopPoll";

    /**
     * Unique identifier for the target chat or username of the
     * target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Identifier of the original message with the poll
     */
    @JsonProperty("message_id")
    private Long messageId;

    /**
     * A JSON-serialized object for a new message inline keyboard.
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    public StopPoll(String token, Long chatId, Long messageId) {
        super(token);
        this.chatId = chatId;
        this.messageId = messageId;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference type() {
        return Types.POLL;
    }
}
