package resnyx.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * An anchor.
 */
@Data
@NoArgsConstructor
public final class RichTextAnchor implements RichText {

    /**
     * Type of the rich text, always “anchor”
     */
    private String type;

    /**
     * The name of the anchor
     */
    private String name;
}
