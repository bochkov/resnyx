package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents the content of a rich message to be sent as the result of an inline query.
 */
@Data
@NoArgsConstructor
public final class InputRichMessageContent {

    /**
     * The message to be sent
     */
    @JsonProperty("rich_message")
    private InputRichMessage richMessage;
}
