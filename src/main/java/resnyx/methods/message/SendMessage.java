package resnyx.methods.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.ReplyMethod;
import resnyx.Types;
import resnyx.model.Message;

/**
 * Use this method to send text messages. On success, the sent {@link Message} is returned.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class SendMessage extends ReplyMethod<Message> {

    public static final String METHOD = "sendMessage";

    /**
     * Unique identifier for the target chat or username of the target
     * channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Text of the message to be sent
     */
    private String text;

    /**
     * Optional. Disables link previews for links in this message
     */
    @JsonProperty("disable_web_page_preview")
    private Boolean disablePreview;

    public SendMessage(String token, Long chatId, String text) {
        super(token);
        this.chatId = chatId;
        this.text = text;
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
