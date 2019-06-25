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
 * As of v.4.0, Telegram clients support rounded square mp4 videos of up to 1 minute long.
 * Use this method to send video messages. On success, the sent Message is returned.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class SendVideoNote extends ReplyMethod<Message> {

    public static final String METHOD = "sendVideoNote";

    /**
     * Unique identifier for the target chat or username of the
     * target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Video note to send. Pass a file_id as String to send a video note that
     * exists on the Telegram servers (recommended) or upload a new video using multipart/form-data.
     * Sending video notes by a URL is currently unsupported
     */
    @JsonProperty("video_note")
    private String videoNote;

    /**
     * Optional. Duration of sent video in seconds
     */
    private Integer duration;

    /**
     * Optional. Video width and height, i.e. diameter of the video message
     */
    private Integer length;

    /**
     * Optional. Thumbnail of the file sent; can be ignored if thumbnail generation for the
     * file is supported server-side. The thumbnail should be in JPEG format and less than 200 kB in size.
     * A thumbnail‘s width and height should not exceed 320. Ignored if the file is not uploaded
     * using multipart/form-data. Thumbnails can’t be reused and can be only uploaded as a new file,
     * so you can pass “attach://<file_attach_name>” if the thumbnail was uploaded using
     * multipart/form-data under <file_attach_name>
     */
    private String thumb;

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference type() {
        return Types.MESSAGE;
    }
}
