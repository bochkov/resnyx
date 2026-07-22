package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A subscript text.
 */
@Data
@NoArgsConstructor
public final class RichTextSubscript implements RichText {

    /**
     * Type of the rich text, always “subscript”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;
}
