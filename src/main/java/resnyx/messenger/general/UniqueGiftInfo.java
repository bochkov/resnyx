package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeDeserializer;

import java.time.LocalDateTime;

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
     * Origin of the gift. Currently, either "upgrade" for gifts upgraded from regular gifts,
     * "transfer" for gifts transferred from other users or channels,
     * or "resale" for gifts bought from other users
     */
    private String origin;

    /**
     * Optional. For gifts bought from other users, the price paid for the gift
     */
    @JsonProperty("last_resale_star_count")
    private Integer lastResaleStarCount;

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

    /**
     * Optional. Point in time (Unix timestamp) when the gift can be transferred. If it is in the past, then the gift can be transferred now
     */
    @JsonProperty("next_transfer_date")
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime nextTransferDate;
}
