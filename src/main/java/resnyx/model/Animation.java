package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represents an animation file (GIF or H.264/MPEG-4 AVC video without sound).
 */
@Data
public final class Animation {

    /**
     * Unique file identifier
     */
    @JsonProperty("file_id")
    private String id;

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
     * Optional. Animation thumbnail as defined by sender
     */
    private PhotoSize thumb;

    /**
     * Optional. Original animation filename as defined by sender
     */
    @JsonProperty("file_name")
    private String name;

    /**
     * Optional. MIME type of the file as defined by sender
     */
    @JsonProperty("mime_type")
    private String mime;

    /**
     * Optional. File size
     */
    @JsonProperty("file_size")
    private Integer size;
}
