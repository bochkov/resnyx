package resnyx.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A mention by a username.
 */
@Data
@NoArgsConstructor
public final class RichTextMention implements RichText {

    /**
     * Type of the rich text, always “mention”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;

    /**
     * The username
     */
    private String username;
}
