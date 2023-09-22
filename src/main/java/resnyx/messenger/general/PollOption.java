package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object contains information about one answer option in a poll.
 */
@Data
@NoArgsConstructor
public final class PollOption {

    /**
     * Option text, 1-100 characters
     */
    private String text;

    /**
     * Number of users that voted for this option
     */
    @JsonProperty("voter_count")
    private Integer voterCount;
}
