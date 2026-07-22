package resnyx.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A superscript text.
 */
@Data
@NoArgsConstructor
public final class RichTextSuperscript implements RichText {

    /**
     * Type of the rich text, always “superscript”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;
}
