package resnyx.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A text paragraph, corresponding to the HTML tag <p>.
 */
@Data
@NoArgsConstructor
public final class RichBlockParagraph implements RichBlock {

    private String type;

    /**
     * Text of the block
     */
    private RichText text;
}
