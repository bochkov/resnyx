package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;

/**
 * A mention of a Telegram user by their identifier.
 */
@Data
@NoArgsConstructor
public final class RichTextTextMention implements RichText {

    /**
     * Type of the rich text, always “text_mention”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;

    /**
     * The mentioned user
     */
    private User user;
}
