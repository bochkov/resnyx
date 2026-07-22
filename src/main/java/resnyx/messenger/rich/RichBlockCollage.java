package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * A collage, corresponding to the custom HTML tag &lt;tg-collage&gt;.
 */
@Data
@NoArgsConstructor
public final class RichBlockCollage implements RichBlock {

    /**
     * Type of the block, always “collage”
     */
    private String type;

    /**
     * Elements of the collage
     */
    private List<RichBlock> blocks;

    /**
     * Optional. Caption of the block
     */
    private RichBlockCaption caption;
}
