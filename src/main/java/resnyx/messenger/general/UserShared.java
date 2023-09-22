package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object contains information about the user whose identifier was shared with the bot using a KeyboardButtonRequestUser button.
 */
@Data
@NoArgsConstructor
public final class UserShared {

    /**
     * Identifier of the request
     */
    @JsonProperty("request_id")
    private Long requestId;

    @JsonUnwrapped
    private UserId userId;
}
