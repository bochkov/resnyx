package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A footer, corresponding to the HTML tag &lt;footer&gt;.
 */
@Data
@NoArgsConstructor
public final class RichBlockFooter implements RichBlock {

    /**
     * Type of the block, always “footer”
     */
    private String type;

    /**
     * Text of the block
     */
    private RichText text;
}
