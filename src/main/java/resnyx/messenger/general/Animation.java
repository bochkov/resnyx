package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.FileAttr;

/**
 * This object represents an animation file (GIF or H.264/MPEG-4 AVC video without sound).
 */
@Data
@NoArgsConstructor
public final class Animation {

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
     * Optional. Animation thumbnail as defined by sender
     */
    private PhotoSize thumbnail;

    /**
     * Optional. Original animation filename as defined by sender
     */
    @JsonProperty("file_name")
    private String fileName;

    /**
     * Optional. MIME type of the file as defined by sender
     */
    @JsonProperty("mime_type")
    private String mimeType;
}
