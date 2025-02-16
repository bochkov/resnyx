package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.FileAttr;

import java.util.List;

/**
 * This object represents a video file.
 */
@Data
@NoArgsConstructor
public final class Video {

    @JsonUnwrapped
    private FileAttr fileAttr;

    /**
     * Video width as defined by sender
     */
    private Integer width;

    /**
     * Video height as defined by sender
     */
    private Integer height;

    /**
     * Duration of the video in seconds as defined by sender
     */
    private Integer duration;

    /**
     * Optional. Video thumbnail
     */
    private PhotoSize thumbnail;

    /**
     * Optional. Available sizes of the cover of the video in the message
     */
    private List<PhotoSize> cover;

    /**
     * Optional. Timestamp in seconds from which the video will play in the message
     */
    @JsonProperty("start_timestamp")
    private Integer startTimestamp;

    /**
     * Optional. Original filename as defined by sender
     */
    @JsonProperty("file_name")
    private String fileName;

    /**
     * Optional. MIME type of the file as defined by sender
     */
    @JsonProperty("mime_type")
    private String mimeType;
}
