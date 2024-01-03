package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a reaction added to a message along with the number of times it was added.
 */
@Data
@NoArgsConstructor
public final class ReactionCount {

    /**
     * Type of the reaction
     */
    private ReactionType type;

    /**
     * Number of times the reaction was added
     */
    @JsonProperty("total_count")
    private Integer totalCount;
}
