package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A block with an anchor, corresponding to the HTML tag &lt;a&gt; with the attribute name.
 */
@Data
@NoArgsConstructor
public final class InputRichBlockAnchor implements InputRichBlock {

    /**
     * Type of the block, always “anchor”
     */
    private String type;

    /**
     * The name of the anchor
     */
    private String name;
}
