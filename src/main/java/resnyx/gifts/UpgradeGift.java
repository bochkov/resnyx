package resnyx.gifts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Upgrades a given regular gift to a unique gift.
 * Requires the <i>can_transfer_and_upgrade_gifts</i> business bot right.
 * Additionally requires the <i>can_transfer_stars</i> business bot right if the upgrade is paid.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class UpgradeGift implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which to read the message
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;

    /**
     * Unique identifier of the regular gift that should be upgraded to a unique one
     */
    @JsonProperty("owned_gift_id")
    private final String ownedGiftId;

    /**
     * Pass True to keep the original gift text, sender and receiver in the upgraded gift
     */
    @JsonProperty("keep_original_details")
    private Boolean keepOriginalDetails;

    /**
     * The amount of Telegram Stars that will be paid for the upgrade from the business account balance.
     * If gift.prepaid_upgrade_star_count > 0, then pass 0,
     * otherwise, the can_transfer_stars business bot right is required and gift.upgrade_star_count must be passed.
     */
    @JsonProperty("star_count")
    private Integer starCount;
}
