package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Location;
import resnyx.messenger.general.User;

/**
 * Represents a result of an inline query that was chosen by the user and sent to their chat partner.
 */
@Data
@NoArgsConstructor
public final class ChosenInlineResult {

    /**
     * The unique identifier for the result that was chosen
     */
    @JsonProperty("result_id")
    private String resultId;

    /**
     * The user that chose the result
     */
    private User from;

    /**
     * Optional. Sender location, only for bots that require user location
     */
    private Location location;

    /**
     * Optional. Identifier of the sent inline message.
     * Available only if there is an inline keyboard attached to the message.
     * Will be also received in callback queries and can be used to edit the message.
     */
    @JsonProperty("inline_message_id")
    private String inlineMessageId;

    /**
     * The query that was used to obtain the result
     */
    private String query;
}
