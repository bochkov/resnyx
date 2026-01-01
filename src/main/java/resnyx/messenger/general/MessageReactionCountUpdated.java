package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.chat.ReactionType;
import resnyx.util.UnixTimeDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.List;

/**
 * This object represents reaction changes on a message with anonymous reactions.
 */
@Data
@NoArgsConstructor
public final class MessageReactionCountUpdated {

    /**
     * The chat containing the message
     */
    private Chat chat;

    /**
     * Unique message identifier inside the chat
     */
    @JsonProperty("message_id")
    private Long messageId;

    /**
     * Date of the change in Unix time
     */
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime date;

    /**
     * List of reactions that are present on the message
     */
    private List<ReactionType> reactions;

}
