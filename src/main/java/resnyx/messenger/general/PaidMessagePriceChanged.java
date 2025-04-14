package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes a service message about a change in the price of paid messages within a chat.
 */
@Data
@NoArgsConstructor
public final class PaidMessagePriceChanged {

    /**
     * The new number of Telegram Stars that must be paid by non-administrator users of the supergroup chat for each sent message
     */
    @JsonProperty("paid_message_star_count")
    private Integer paidMessageStarCount;
}
