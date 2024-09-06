package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents a service message about the creation of a scheduled giveaway.
 * Currently holds no information.
 */
@Data
@NoArgsConstructor
public final class GiveawayCreated {

    /**
     * Optional. The number of Telegram Stars to be split between giveaway winners; for Telegram Star giveaways only
     */
    @JsonProperty("prize_star_count")
    private Integer prizeStarCount;
}
