package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Describes a service message about an option added to a poll.
 */
@Data
@NoArgsConstructor
public final class PollOptionAdded {

    /**
     * Optional. Message containing the poll to which the option was added, if known.
     * Note that the Message object in this field will not contain
     * the reply_to_message field even if it itself is a reply.
     */
    @JsonProperty("poll_message")
    private MaybeInaccessibleMessage pollMessage;

    /**
     * Unique identifier of the added option
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
