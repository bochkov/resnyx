package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.chat.ReactionType;

/**
 * Describes a story area pointing to a suggested reaction. Currently, a story can have up to 5 suggested reaction areas.
 */
@Data
@NoArgsConstructor
public final class StoryAreaTypeSuggestedReaction implements StoryAreaType {

    /**
     * Type of the area, always “suggested_reaction”
     */
    private String type;

    /**
     * Type of the reaction
     */
    private ReactionType reactionType;

    /**
     * Optional. Pass True if the reaction area has a dark background
     */
    @JsonProperty("is_dark")
    private Boolean isDark;

    /**
     * Optional. Pass True if reaction area corner is flipped
     */
    @JsonProperty("is_flipped")
    private Boolean isFlipped;
}
