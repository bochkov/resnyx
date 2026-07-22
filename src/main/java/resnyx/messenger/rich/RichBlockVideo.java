package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Video;

/**
 * A block with a video, corresponding to the HTML tag &lt;video&gt;.
 */
@Data
@NoArgsConstructor
public final class RichBlockVideo implements RichBlock {

    /**
     * Type of the block, always “video”
     */
    private String type;

    /**
     * The video
     */
    private Video video;

    /**
     * Optional. True, if the media preview is covered by a spoiler animation
     */
    @JsonProperty("has_spoiler")
    private Boolean hasSpoiler;

    /**
     * Optional. Caption of the block
     */
    private RichBlockCaption caption;
}
