package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.List;

/**
 * This object contains information about one answer option in a poll.
 */
@Data
@NoArgsConstructor
public final class PollOption {

    /**
     * Unique identifier of the option, persistent on option addition and deletion
     */
    @JsonProperty("persistent_id")
    private String persistentId;

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
     * Optional. Media added to the poll option
     */
    private PollMedia media;

    /**
     * Number of users that voted for this option
     */
    @JsonProperty("voter_count")
    private Integer voterCount;

    /**
     * Optional. User who added the option; omitted if the option wasn't added by a user after poll creation
     */
    @JsonProperty("added_by_user")
    private User addedByUser;

    /**
     * Optional. Chat that added the option; omitted if the option wasn't added by a chat after poll creation
     */
    @JsonProperty("added_by_chat")
    private Chat addedByChat;

    /**
     * Optional. Point in time (Unix timestamp) when the option was added;
     * omitted if the option existed in the original poll
     */
    @JsonProperty("addition_date")
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime additionDate;
}
