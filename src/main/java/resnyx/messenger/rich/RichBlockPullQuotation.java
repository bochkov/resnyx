package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A quotation with centered text, loosely corresponding to the HTML tag &lt;aside&gt;.
 */
@Data
@NoArgsConstructor
public final class RichBlockPullQuotation implements RichBlock {

    /**
     * Type of the block, always “pullquote”
     */
    private String type;

    /**
     * Text of the block
     */
    private RichText text;

    /**
     * Optional. Credit of the block
     */
    private RichText credit;
}
