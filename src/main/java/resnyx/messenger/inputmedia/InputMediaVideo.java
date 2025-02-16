package resnyx.messenger.inputmedia;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Caption;
import resnyx.common.InputFile;

/**
 * Represents a video to be sent.
 */
@Data
@NoArgsConstructor
public final class InputMediaVideo implements InputMedia {

    /**
     * Type of the result, must be video
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
     * Optional. Cover for the video in the message.
     * Pass a file_id to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL for Telegram to get a file from the Internet,
     * or pass “attach://<file_attach_name>” to upload a new one using multipart/form-data under <file_attach_name> name
     */
    private String cover;

    /**
     * Optional. Start timestamp for the video in the message
     */
    @JsonProperty("start_timestamp")
    private Integer startTimestamp;

    @JsonUnwrapped
    private Caption caption;

    /**
     * Optional. Video width
     */
    private Integer width;

    /**
     * Optional. Video height
     */
    private Integer height;

    /**
     * Optional. Video duration in seconds
     */
    private Integer duration;

    /**
     * Optional. Pass True if the uploaded video is suitable for streaming
     */
    @JsonProperty("supports_streaming")
    private Boolean supportsStreaming;

    /**
     * Optional. Pass True if the video needs to be covered with a spoiler animation
     */
    @JsonProperty("has_spoiler")
    private Boolean hasSpoiler;
}
