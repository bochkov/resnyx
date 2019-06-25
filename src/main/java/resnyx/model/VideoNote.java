package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represents a video message (available in Telegram apps as of v.4.0).
 */
@Data
public final class VideoNote {

    /**
     * Unique identifier for this file
     */
    @JsonProperty("file_id")
    private String id;

    /**
     * Video width and height (diameter of the video message) as defined by sender
     */
    private Integer length;

    /**
     * Duration of the video in seconds as defined by sender
     */
    private Integer duration;

    /**
     * Optional. Video thumbnail
     */
    private PhotoSize thumb;

    /**
     * Optional. File size
     */
    @JsonProperty("file_size")
    private Integer size;
}
