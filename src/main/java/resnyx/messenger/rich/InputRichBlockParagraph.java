package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A text paragraph, corresponding to the HTML tag &lt;p&gt;.
 */
@Data
@NoArgsConstructor
public final class InputRichBlockParagraph implements InputRichBlock {

    /**
     * Type of the block, always “paragraph”
     */
    private String type;

    /**
     * Text of the block
     */
    private RichText text;
}
