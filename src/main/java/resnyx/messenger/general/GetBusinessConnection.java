package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to get information about the connection of the bot with a business account.
 * Returns a BusinessConnection object on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetBusinessConnection implements TgMethod {

    /**
     * Unique identifier of the business connection
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;
}
