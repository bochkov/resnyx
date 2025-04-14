package resnyx.messenger.business;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Transfers Telegram Stars from the business account balance to the bot's balance.
 * Requires the <i>can_transfer_stars</i> business bot right.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class TransferBusinessAccountStars implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which to read the message
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;

    /**
     * Number of Telegram Stars to transfer; 1-10000
     */
    @JsonProperty("star_count")
    private final Integer starCount;
}
