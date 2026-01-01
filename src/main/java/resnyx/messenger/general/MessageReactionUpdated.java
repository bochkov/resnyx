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
 * This object represents a change of a reaction on a message performed by a user.
 */
@Data
@NoArgsConstructor
public final class MessageReactionUpdated {

    /**
     * The chat containing the message the user reacted to
     */
    private Chat chat;

    /**
     * Unique identifier of the message inside the chat
     */
    @JsonProperty("message_id")
    private Long messageId;

    /**
     * Optional. The user that changed the reaction, if the user isn't anonymous
     */
    private User user;

    /**
     * Optional. The chat on behalf of which the reaction was changed, if the user is anonymous
     */
    @JsonProperty("actor_chat")
    private Chat actorChat;

    /**
     * Date of the change in Unix time
     */
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime date;

    /**
     * Previous list of reaction types that were set by the user
     */
    @JsonProperty("old_reaction")
    private List<ReactionType> oldReaction;

    /**
     * New list of reaction types that have been set by the user
     */
    @JsonProperty("new_reaction")
    private List<ReactionType> newReaction;

}
