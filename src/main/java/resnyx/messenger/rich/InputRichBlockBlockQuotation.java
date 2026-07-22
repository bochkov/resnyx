package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * A block quotation, corresponding to the HTML tag &lt;blockquote&gt;.
 */
@Data
@NoArgsConstructor
public final class InputRichBlockBlockQuotation implements InputRichBlock {

    /**
     * Type of the block, always “blockquote”
     */
    private String type;

    /**
     * Content of the block
     */
    private List<InputRichBlock> blocks;

    /**
     * Optional. Credit of the block
     */
    private RichText credit;
}
