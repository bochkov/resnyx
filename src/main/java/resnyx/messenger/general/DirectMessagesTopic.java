package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes a topic of a direct messages chat.
 */
@Data
@NoArgsConstructor
public final class DirectMessagesTopic {

    /**
     * Unique identifier of the topic
     */
    @JsonProperty("topic_id")
    private Integer topicId;

    /**
     * Optional. Information about the user that created the topic. Currently, it is always present
     */
    private User user;
}
