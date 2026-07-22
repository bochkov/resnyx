package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A text covered by a spoiler.
 */
@Data
@NoArgsConstructor
public final class RichTextSpoiler implements RichText {

    /**
     * Type of the rich text, always “spoiler”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;
}
