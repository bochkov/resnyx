package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * An underlined text.
 */
@Data
@NoArgsConstructor
public final class RichTextUnderline implements RichText {

    /**
     * Type of the rich text, always “underline”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;
}
