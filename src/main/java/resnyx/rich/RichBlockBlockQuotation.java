package resnyx.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * A block quotation, corresponding to the HTML tag &lt;blockquote&gt;.
 */
@Data
@NoArgsConstructor
public final class RichBlockBlockQuotation implements RichBlock {

    /**
     * Type of the block, always “blockquote”
     */
    private String type;

    /**
     * Content of the block
     */
    private List<RichBlock> blocks;

    /**
     * Optional. Credit of the block
     */
    private RichText credit;
}
