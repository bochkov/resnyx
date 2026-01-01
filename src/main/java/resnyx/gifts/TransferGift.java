package resnyx.gifts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Transfers an owned unique gift to another user.
 * Requires the <i>can_transfer_and_upgrade_gifts</i> business bot right.
 * Requires <i>can_transfer_stars</i> business bot right if the transfer is paid.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class TransferGift implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which to read the message
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;

    /**
     * Unique identifier of the regular gift that should be transferred
     */
    @JsonProperty("owned_gift_id")
    private final String ownedGiftId;

    /**
     * Unique identifier of the chat which will own the gift. The chat must be active in the last 24 hours.
     */
    @JsonProperty("new_owner_chat_id")
    private final Long newOwnerChatId;

    /**
     * The amount of Telegram Stars that will be paid for the transfer from the business account balance.
     * If positive, then the can_transfer_stars business bot right is required.
     */
    @JsonProperty("star_count")
    private Integer starCount;
}
