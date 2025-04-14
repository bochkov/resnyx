package resnyx.messenger.business;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Changes the username of a managed business account.
 * Requires the <i>can_change_username</i> business bot right.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetBusinessAccountUsername implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which to read the message
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;

    /**
     * The new value of the username for the business account; 0-32 characters
     */
    private String username;
}
