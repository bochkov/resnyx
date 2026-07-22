package resnyx.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A reference.
 */
@Data
@NoArgsConstructor
public final class RichTextReference implements RichText {

    /**
     * Type of the rich text, always “reference”
     */
    private String type;

    /**
     * Text of the reference
     */
    private RichText text;

    /**
     * The name of the reference
     */
    private String name;
}
