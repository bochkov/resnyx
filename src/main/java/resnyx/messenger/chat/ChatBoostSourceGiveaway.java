package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;

/**
 * The boost was obtained by the creation of a Telegram Premium giveaway.
 * This boosts the chat 4 times for the duration of the corresponding Telegram Premium subscription.
 */
@Data
@NoArgsConstructor
public final class ChatBoostSourceGiveaway implements ChatBoostSource {

    /**
     * Source of the boost, always “giveaway”
     */
    private String source;

    /**
     * Identifier of a message in the chat with the giveaway; the message could have been deleted already.
     * May be 0 if the message isn't sent yet.
     */
    @JsonProperty("giveaway_message_id")
    private Integer giveawayMessageId;

    /**
     * Optional. User that won the prize in the giveaway if any
     */
    private User user;

    /**
     * Optional. The number of Telegram Stars to be split between giveaway winners; for Telegram Star giveaways only
     */
    @JsonProperty("prize_star_count")
    private Integer prizeStarCount;

    /**
     * Optional. True, if the giveaway was completed, but there was no user to win the prize
     */
    @JsonProperty("is_unclaimed")
    private Boolean isUnclaimed;
}
