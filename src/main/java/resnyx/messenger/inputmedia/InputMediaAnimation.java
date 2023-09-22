package resnyx.messenger.inputmedia;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Caption;
import resnyx.common.InputFile;

/**
 * Represents an animation file (GIF or H.264/MPEG-4 AVC video without sound) to be sent.
 */
@Data
@NoArgsConstructor
public final class InputMediaAnimation implements InputMedia {

    /**
     * Type of the result, must be animation
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

    @JsonUnwrapped
    private Caption caption;

    /**
     * Optional. Animation width
     */
    private Integer width;

    /**
     * Optional. Animation height
     */
    private Integer height;

    /**
     * Optional. Animation duration in seconds
     */
    private Integer duration;

    /**
     * Optional. Pass True if the animation needs to be covered with a spoiler animation
     */
    @JsonProperty("has_spoiler")
    private Boolean hasSpoiler;

}
