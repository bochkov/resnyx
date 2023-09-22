package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes an inline message sent by a Web App on behalf of a user.
 */
@Data
@NoArgsConstructor
public final class SentWebAppMessage {

    /**
     * Optional. Identifier of the sent inline message.
     * Available only if there is an inline keyboard attached to the message.
     */
    @JsonProperty("inline_message_id")
    private String inlineMessageId;
}
