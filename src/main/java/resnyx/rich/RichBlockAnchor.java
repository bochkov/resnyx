package resnyx.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A block with an anchor, corresponding to the HTML tag &lt;a&gt; with the attribute name.
 */
@Data
@NoArgsConstructor
public final class RichBlockAnchor implements RichBlock {

    /**
     * Type of the block, always “anchor”
     */
    private String type;

    /**
     * Text of the block
     */
    private String text;
}
