package resnyx.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * An italicized text.
 */
@Data
@NoArgsConstructor
public final class RichTextItalic implements RichText {

    /**
     * Type of the rich text, always “italic”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;
}
