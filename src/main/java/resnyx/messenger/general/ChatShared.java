package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object contains information about the chat whose identifier was shared with the bot using a KeyboardButtonRequestChat button.
 */
@Data
@NoArgsConstructor
public final class ChatShared {

    /**
     * Identifier of the request
     */
    @JsonProperty("request_id")
    private Long requestId;

    @JsonUnwrapped
    private ChatId chatId;
}
