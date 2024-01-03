package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object describes a message that was deleted or is otherwise inaccessible to the bot.
 */
@Data
@NoArgsConstructor
public final class InaccessibleMessage implements MaybeInaccessibleMessage {

    /**
     * Chat the message belonged to
     */
    private Chat chat;

    /**
     * Unique message identifier inside the chat
     */
    @JsonProperty("message_id")
    private Long messageId;

    /**
     * Always 0. The field can be used to differentiate regular and inaccessible messages.
     */
    private Integer date;
}
