package resnyx.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A custom emoji.
 */
@Data
@NoArgsConstructor
public final class RichTextCustomEmoji implements RichText {

    /**
     * Type of the rich text, always “custom_emoji”
     */
    private String type;

    /**
     * The text
     */
    private String text;

    /**
     * Unique identifier of the custom emoji. Use getCustomEmojiStickers to get full information about the sticker.
     */
    @JsonProperty("custom_emoji_id")
    private String customEmojiId;

    /**
     * Alternative emoji for the custom emoji
     */
    @JsonProperty("alternative_text")
    private String alternativeText;
}
