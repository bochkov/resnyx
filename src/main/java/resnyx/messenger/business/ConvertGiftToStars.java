package resnyx.messenger.business;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Converts a given regular gift to Telegram Stars.
 * Requires the <i>can_convert_gifts_to_stars</i> business bot right.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class ConvertGiftToStars implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which to read the message
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;

    /**
     * Unique identifier of the regular gift that should be converted to Telegram Stars
     */
    @JsonProperty("owned_gift_id")
    private final String ownedGiftId;
}
