package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.FileAttr;

/**
 * This object represents a video file of a specific quality.
 */
@Data
@NoArgsConstructor
public final class VideoQuality {

    @JsonUnwrapped
    private FileAttr fileAttr;

    /**
     * Video width
     */
    @JsonProperty
    private Integer width;

    /**
     * Video height
     */
    @JsonProperty
    private Integer height;

    /**
     * Codec that was used to encode the video, for example, “h264”, “h265”, or “av01”
     */
    @JsonProperty
    private String codec;

}
