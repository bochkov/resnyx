package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.Caption;
import resnyx.common.InputFile;
import resnyx.common.SendOptions;

/**
 * Use this method to send audio files, if you want Telegram clients to display them in the music player.
 * Your audio must be in the .MP3 or .M4A format.
 * On success, the sent Message is returned.
 * Bots can currently send audio files of up to 50 MB in size, this limit may be changed in the future.
 * <p>
 * For sending voice messages, use the sendVoice method instead.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendAudio implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which the message will be sent
     */
    @JsonProperty("business_connection_id")
    private String businessConnectionId;

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Audio file to send. Pass a file_id as String to send an audio file that exists on the Telegram servers (recommended),
     * pass an HTTP URL as a String for Telegram to get an audio file from the Internet, or upload a new one using multipart/form-data.
     */
    private final InputFile audio;

    @JsonUnwrapped
    private Caption caption;

    /**
     * Duration of the audio in seconds
     */
    private Integer duration;

    /**
     * Performer
     */
    private String performer;

    /**
     * Track name
     */
    private String title;

    /**
     * Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     * The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail's width and height should not exceed 320.
     * Ignored if the file is not uploaded using multipart/form-data.
     * Thumbnails can't be reused and can be only uploaded as a new file,
     * so you can pass “attach://&lt;file_attach_name&gt;” if the thumbnail was uploaded
     * using multipart/form-data under &lt;file_attach_name&gt;
     */
    private InputFile thumbnail;

    @JsonUnwrapped
    private SendOptions sendOptions;
}
