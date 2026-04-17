package resnyx.messenger.keyboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object defines the parameters for the creation of a managed bot.
 * Information about the created bot will be shared with the bot using the update managed_bot
 * and a Message with the field managed_bot_created.
 */
@Data
@NoArgsConstructor
public final class KeyboardButtonRequestManagedBot {

    /**
     * Signed 32-bit identifier of the request. Must be unique within the message
     */
    @JsonProperty("request_id")
    private Long requestId;

    /**
     * Optional. Suggested name for the bot
     */
    @JsonProperty("suggested_name")
    private String suggestedName;

    /**
     * Optional. Suggested username for the bot
     */
    @JsonProperty("suggested_username")
    private String suggestedUsername;
}
