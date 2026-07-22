package resnyx.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Animation;

/**
 * A block with an animation, corresponding to the HTML tag &lt;video&gt;.
 */
@Data
@NoArgsConstructor
public final class RichBlockAnimation implements RichBlock {

    /**
     * Type of the block, always “animation”
     */
    private String type;

    /**
     * The animation
     */
    private Animation animation;

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
