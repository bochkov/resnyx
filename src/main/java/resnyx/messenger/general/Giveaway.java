package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.List;

/**
 * This object represents a message about a scheduled giveaway.
 */
@Data
@NoArgsConstructor
public final class Giveaway {

    /**
     * The list of chats which the user must join to participate in the giveaway
     */
    private List<Chat> chats;

    /**
     * Point in time (Unix timestamp) when winners of the giveaway will be selected
     */
    @JsonProperty("winners_selection_date")
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime winnersSelectionDate;

    /**
     * The number of users which are supposed to be selected as winners of the giveaway
     */
    @JsonProperty("winner_count")
    private Integer winnerCount;

    /**
     * Optional. True, if only users who join the chats after the giveaway started should be eligible to win
     */
    @JsonProperty("only_new_members")
    private Boolean onlyNewMembers;

    /**
     * Optional. True, if the list of giveaway winners will be visible to everyone
     */
    @JsonProperty("has_public_winners")
    private Boolean hasPublicWinners;

    /**
     * Optional. Description of additional giveaway prize
     */
    @JsonProperty("prize_description")
    private String prizeDescription;

    /**
     * Optional. A list of two-letter ISO 3166-1 alpha-2 country codes indicating the countries from which eligible users for the giveaway must come.
     * If empty, then all users can participate in the giveaway. Users with a phone number that was bought on Fragment can always participate in giveaways.
     */
    @JsonProperty("country_codes")
    private List<String> countryCodes;

    /**
     * Optional. The number of Telegram Stars to be split between giveaway winners; for Telegram Star giveaways only
     */
    @JsonProperty("prize_star_count")
    private Integer prizeStarCount;

    /**
     * Optional. The number of months the Telegram Premium subscription won from the giveaway will be active for
     */
    @JsonProperty("premium_subscription_month_count")
    private Integer premiumSubscriptionMonthCount;
}
