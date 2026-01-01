package resnyx.gifts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

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
     * Origin of the gift.
     * Currently, either “upgrade” for gifts upgraded from regular gifts,
     * “transfer” for gifts transferred from other users or channels,
     * “resale” for gifts bought from other users,
     * “gifted_upgrade” for upgrades purchased after the gift was sent,
     * or “offer” for gifts bought or sold through gift purchase offers
     */
    private String origin;

    /**
     * Optional. For gifts bought from other users, the currency in which the payment for the gift was done.
     * Currently, one of “XTR” for Telegram Stars or “TON” for toncoins.
     */
    @JsonProperty("last_resale_currency")
    private String lastResaleCurrency;

    /**
     * Optional. For gifts bought from other users, the price paid for the gift in either Telegram Stars or nanotoncoins
     */
    @JsonProperty("last_resale_amount")
    private Integer lastResaleAmount;

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
     * Optional. Point in time (Unix timestamp) when the gift can be transferred.
     * If it is in the past, then the gift can be transferred now
     */
    @JsonProperty("next_transfer_date")
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime nextTransferDate;
}
