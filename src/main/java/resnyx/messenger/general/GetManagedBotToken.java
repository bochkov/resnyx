package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to get the token of a managed bot. Returns the token as String on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetManagedBotToken implements TgMethod {

    /**
     * User identifier of the managed bot whose token will be returned
     */
    @JsonProperty("user_id")
    private final Long userId;
}
