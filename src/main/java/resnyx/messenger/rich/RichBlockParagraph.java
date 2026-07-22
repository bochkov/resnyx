package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A text paragraph, corresponding to the HTML tag <p>.
 */
@Data
@NoArgsConstructor
public final class RichBlockParagraph implements RichBlock {

    /**
     * Type of the block, always “paragraph”
     */
    private String type;

    /**
     * Text of the block
     */
    private RichText text;
}
