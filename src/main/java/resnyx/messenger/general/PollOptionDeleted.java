package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Describes a service message about an option deleted from a poll.
 */
@Data
@NoArgsConstructor
public final class PollOptionDeleted {

    /**
     * Optional. Message containing the poll from which the option was deleted, if known.
     * Note that the Message object in this field will not contain
     * the reply_to_message field even if it itself is a reply.
     */
    @JsonProperty("poll_message")
    private MaybeInaccessibleMessage pollMessage;

    /**
     * Unique identifier of the deleted option
     */
    @JsonProperty("option_persistent_id")
    private String optionPersistentId;

    /**
     * Option text
     */
    @JsonProperty("option_text")
    private String optionText;

    /**
     * Optional. Special entities that appear in the option_text
     */
    @JsonProperty("option_text_entities")
    private List<MessageEntity> optionTextEntities;
}
