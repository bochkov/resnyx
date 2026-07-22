package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * A slideshow, corresponding to the custom HTML tag &lt;tg-slideshow&gt;.
 */
@Data
@NoArgsConstructor
public final class RichBlockSlideshow implements RichBlock {

    /**
     * Type of the block, always “slideshow”
     */
    private String type;

    /**
     * Elements of the slideshow
     */
    private List<RichBlock> blocks;

    /**
     * Optional. Caption of the block
     */
    private RichBlockCaption caption;

}
