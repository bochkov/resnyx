package resnyx.messenger.business;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Changes the first and last name of a managed business account.
 * Requires the <i>can_change_name</i> business bot right.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetBusinessAccountName implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which to read the message
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;

    /**
     * The new value of the first name for the business account; 1-64 characters
     */
    @JsonProperty("first_name")
    private final String firstName;

    /**
     * The new value of the last name for the business account; 0-64 characters
     */
    @JsonProperty("last_name")
    private String lastName;
}
