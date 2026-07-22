package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A bold text.
 */
@Data
@NoArgsConstructor
public final class RichTextBold implements RichText {

    /**
     * Type of the rich text, always “bold”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;

}
