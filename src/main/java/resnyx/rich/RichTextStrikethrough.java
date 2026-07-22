package resnyx.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A strikethrough text.
 */
@Data
@NoArgsConstructor
public final class RichTextStrikethrough implements RichText {

    /**
     * Type of the rich text, always “strikethrough”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;
}
