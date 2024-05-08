package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * This object contains information about one answer option in a poll.
 */
@Data
@NoArgsConstructor
public final class PollOption {

    /**
     * Option text, 1-100 characters
     */
    private String text;

    /**
     * Optional. Special entities that appear in the option text.
     * Currently, only custom emoji entities are allowed in poll option texts
     */
    @JsonProperty("text_entities")
    private List<MessageEntity> textEntities;

    /**
     * Number of users that voted for this option
     */
    @JsonProperty("voter_count")
    private Integer voterCount;
}
