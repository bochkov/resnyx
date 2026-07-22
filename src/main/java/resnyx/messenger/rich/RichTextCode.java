package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A monowidth text.
 */
@Data
@NoArgsConstructor
public final class RichTextCode implements RichText {

    /**
     * Type of the rich text, always “code”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;
}
