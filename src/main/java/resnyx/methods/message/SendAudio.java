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
 * Use this method to send audio files, if you want Telegram clients to display
 * them in the music player. Your audio must be in the .mp3 format.
 * On success, the sent Message is returned. Bots can currently send audio
 * files of up to 50 MB in size, this limit may be changed in the future.
 * <p>
 * For sending voice messages, use the {@link SendVoice} method instead.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class SendAudio extends ReplyMethod<Message> {

    public static final String METHOD = "sendAudio";

    /**
     * Unique identifier for the target chat or username of the
     * target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Audio file to send. Pass a file_id as String to send an audio file that exists
     * on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram
     * to get an audio file from the Internet, or upload a new one using multipart/form-data
     */
    private String audio;

    /**
     * Optional. Audio caption, 0-1024 characters
     */
    private String caption;

    /**
     * Optional. Duration of the audio in seconds
     */
    private Integer duration;

    /**
     * Optional. Performer
     */
    private String performer;

    /**
     * Optional. Track name
     */
    private String title;

    /**
     * Optional. Thumbnail of the file sent; can be ignored if thumbnail generation for the
     * file is supported server-side. The thumbnail should be in JPEG format and less
     * than 200 kB in size. A thumbnail‘s width and height should not exceed 320.
     * Ignored if the file is not uploaded using multipart/form-data.
     * Thumbnails can’t be reused and can be only uploaded as a new file,
     * so you can pass “attach://<file_attach_name>” if the thumbnail was uploaded
     * using multipart/form-data under <file_attach_name>.
     */
    private String thumb;

    public SendAudio(String token, Long chatId, String audio) {
        super(token);
        this.chatId = chatId;
        this.audio = audio;
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
