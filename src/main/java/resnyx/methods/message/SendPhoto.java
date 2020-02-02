package resnyx.methods.message;

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
 * Use this method to send photos. On success, the sent {@link Message} is returned.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class SendPhoto extends ReplyMethod<Message> {

    public static final String METHOD = "sendPhoto";

    /**
     * Unique identifier for the target chat or username of the target
     * channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Photo to send. Pass a file_id as String to send a photo that exists on the
     * Telegram servers (recommended), pass an HTTP URL as a String for Telegram to get a
     * photo from the Internet, or upload a new photo using multipart/form-data
     */
    private String photo;

    /**
     * Optional. Photo caption (may also be used when resending photos by file_id), 0-1024 characters
     */
    private String caption;

    public SendPhoto(String token, Long chatId, String photo) {
        super(token);
        this.chatId = chatId;
        this.photo = photo;
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
