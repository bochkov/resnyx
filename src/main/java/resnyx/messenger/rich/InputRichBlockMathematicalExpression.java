package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A block with a mathematical expression in LaTeX format, corresponding to the custom HTML tag &lt;tg-math-block&gt;.
 */
@Data
@NoArgsConstructor
public final class InputRichBlockMathematicalExpression implements InputRichBlock {

    /**
     * Type of the block, always “mathematical_expression”
     */
    private String type;

    /**
     * The mathematical expression in LaTeX format
     */
    private String expression;
}
