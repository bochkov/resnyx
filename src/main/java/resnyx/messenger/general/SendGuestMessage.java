package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes an inline message sent by a guest bot.
 */
@Data
@NoArgsConstructor
public final class SendGuestMessage {

    /**
     * Identifier of the sent inline message
     */
    @JsonProperty("inline_message_id")
    private String inlineMessageId;
}
