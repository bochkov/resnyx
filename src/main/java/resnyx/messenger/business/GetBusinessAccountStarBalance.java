package resnyx.messenger.business;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Returns the amount of Telegram Stars owned by a managed business account.
 * Requires the <i>can_view_gifts_and_stars</i> business bot right.
 * Returns {@link resnyx.messenger.general.StarAmount} on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetBusinessAccountStarBalance implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which to read the message
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;

}
