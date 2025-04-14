package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes a service message about a unique gift that was sent or received.
 */
@Data
@NoArgsConstructor
public final class UniqueGiftInfo {

    /**
     * Information about the gift
     */
    private UniqueGift gift;

    /**
     * Origin of the gift. Currently, either “upgrade” or “transfer”
     */
    private String origin;

    /**
     * Optional. Unique identifier of the received gift for the bot; only present for gifts received on behalf of business accounts
     */
    @JsonProperty("owned_gift_id")
    private String ownedGiftId;

    /**
     * Optional. Number of Telegram Stars that must be paid to transfer the gift; omitted if the bot cannot transfer the gift
     */
    @JsonProperty("transfer_star_count")
    private Integer transferStarCount;
}
