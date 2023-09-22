package resnyx.messenger.inputmedia;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Caption;
import resnyx.common.InputFile;

/**
 * Represents an audio file to be treated as music to be sent.
 */
@Data
@NoArgsConstructor
public final class InputMediaAudio implements InputMedia {

    /**
     * Type of the result, must be audio
     */
    private String type;

    /**
     * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL for Telegram to get a file from the Internet,
     * or pass “attach://&lt;file_attach_name&gt;” to upload a new one using multipart/form-data under &lt;file_attach_name&gt; name.
     */
    private String media;

    /**
     * Optional. Thumbnail of the file sent
     */
    @JsonUnwrapped
    private InputFile thumbnail;

    /**
     * Optional. Caption of the audio to be sent
     */
    @JsonUnwrapped
    private Caption caption;

    /**
     * Optional. Duration of the audio in seconds
     */
    private Integer duration;

    /**
     * Optional. Performer of the audio
     */
    private String performer;

    /**
     * Optional. Title of the audio
     */
    private String title;
}
