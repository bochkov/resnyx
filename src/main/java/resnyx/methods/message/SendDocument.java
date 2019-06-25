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
 * Use this method to send general files. On success, the sent {@link Message} is returned.
 * Bots can currently send files of any type of up to 50 MB in size, this limit may
 * be changed in the future.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class SendDocument extends ReplyMethod<Message> {

    public static final String METHOD = "sendDocument";

    /**
     * Unique identifier for the target chat or username of the
     * target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * File to send. Pass a file_id as String to send a file that exists on the
     * Telegram servers (recommended), pass an HTTP URL as a String for Telegram to get
     * a file from the Internet, or upload a new one using multipart/form-data
     */
    private String document;

    /**
     * Optional. Thumbnail of the file sent; can be ignored if thumbnail generation
     * for the file is supported server-side. The thumbnail should be in JPEG format and
     * less than 200 kB in size. A thumbnail‘s width and height should not exceed 320.
     * Ignored if the file is not uploaded using multipart/form-data.
     * Thumbnails can’t be reused and can be only uploaded as a new file, so you
     * can pass “attach://<file_attach_name>” if the thumbnail was uploaded using
     * multipart/form-data under <file_attach_name>
     */
    private String thumb;

    /**
     * Optional. Document caption (may also be used when
     * resending documents by file_id), 0-1024 characters
     */
    private String caption;

    public SendDocument(String token, Long chatId, String document) {
        super(token);
        this.chatId = chatId;
        this.document = document;
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

