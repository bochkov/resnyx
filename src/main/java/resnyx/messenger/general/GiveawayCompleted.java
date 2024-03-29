package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents a service message about the completion of a giveaway without public winners.
 */
@Data
@NoArgsConstructor
public final class GiveawayCompleted {

    /**
     * Number of winners in the giveaway
     */
    @JsonProperty("winner_count")
    private Integer winnerCount;

    /**
     * Optional. Number of undistributed prizes
     */
    @JsonProperty("unclaimed_prize_count")
    private Integer unclaimedPrizeCount;

    /**
     * Optional. Message with the giveaway that was completed, if it wasn't deleted
     */
    @JsonProperty("giveaway_message")
    private Message giveawayMessage;
}
