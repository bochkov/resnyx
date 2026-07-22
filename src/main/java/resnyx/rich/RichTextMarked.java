package resnyx.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A marked text.
 */
@Data
@NoArgsConstructor
public final class RichTextMarked implements RichText {

    /**
     * Type of the rich text, always “marked”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;
}
