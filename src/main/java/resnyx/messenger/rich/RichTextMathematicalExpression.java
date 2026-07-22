package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A mathematical expression.
 */
@Data
@NoArgsConstructor
public final class RichTextMathematicalExpression implements RichText {

    /**
     * Type of the rich text, always “mathematical_expression”
     */
    private String type;

    /**
     * The expression in LaTeX format
     */
    private String expression;
}
