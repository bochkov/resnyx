package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A hashtag.
 */
@Data
@NoArgsConstructor
public final class RichTextHashtag implements RichText {

    /**
     * Type of the rich text, always “hashtag”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;

    /**
     * The hashtag
     */
    private String hashtag;
}
