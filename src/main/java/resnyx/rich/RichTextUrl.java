package resnyx.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A text with a link.
 */
@Data
@NoArgsConstructor
public final class RichTextUrl implements RichText {

    /**
     * Type of the rich text, always “url”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;

    /**
     * URL of the link
     */
    private String url;
}
