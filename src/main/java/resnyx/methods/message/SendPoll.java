package resnyx.methods.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.ReplyMethod;
import resnyx.Types;
import resnyx.model.Message;

import java.util.List;

/**
 * Use this method to send a native poll.
 * A native poll can't be sent to a private chat. On success, the sent Message is returned.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class SendPoll extends ReplyMethod<Message> {

    public static final String METHOD = "sendPoll";

    /**
     * Unique identifier for the target chat or username of the target
     * channel (in the format @channelusername).
     * A native poll can't be sent to a private chat.
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Poll question, 1-255 characters
     */
    private String question;

    /**
     * List of answer options, 2-10 strings 1-100 characters each
     */
    private List<String> options;

    public SendPoll(String token, Long chatId, String question, List<String> options) {
        super(token);
        this.chatId = chatId;
        this.question = question;
        this.options = options;
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
