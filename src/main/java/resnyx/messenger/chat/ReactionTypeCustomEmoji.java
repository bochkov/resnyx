package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The reaction is based on a custom emoji.
 */
@Data
@NoArgsConstructor
public final class ReactionTypeCustomEmoji implements ReactionType {

    /**
     * Type of the reaction, always “custom_emoji”
     */
    private String type;

    @JsonProperty("custom_emoji_id")
    private String customEmoji;
}
