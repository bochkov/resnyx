package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represents a video file.
 */
@Data
public final class Video {

    /**
     * Unique identifier for this file
     */
    @JsonProperty("file_id")
    private String id;

    /**
     * Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
     */
    @JsonProperty("file_unique_id")
    private String uniqueId;

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
    private PhotoSize thumb;

    /**
     * Optional. Mime type of a file as defined by sender
     */
    @JsonProperty("mime_type")
    private String mime;

    /**
     * Optional. File size
     */
    @JsonProperty("file_size")
    private Integer size;
}
