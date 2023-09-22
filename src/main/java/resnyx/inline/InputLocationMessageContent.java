package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Location;

/**
 * Represents the content of a location message to be sent as the result of an inline query.
 */
@Data
@NoArgsConstructor
public final class InputLocationMessageContent implements InputMessageContent {

    @JsonUnwrapped
    private Location location;
}
