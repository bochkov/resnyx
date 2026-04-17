package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to revoke the current token of a managed bot and generate a new one.
 * Returns the new token as String on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class ReplaceManagedBotToken implements TgMethod {

    /**
     * User identifier of the managed bot whose token will be replaced
     */
    @JsonProperty("user_id")
    private final Long userId;
}
