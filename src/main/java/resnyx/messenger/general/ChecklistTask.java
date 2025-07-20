package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeDeserializer;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Describes a task in a checklist.
 */
@Data
@NoArgsConstructor
public final class ChecklistTask {

    /**
     * Unique identifier of the task
     */
    private Integer id;

    /**
     * Text of the task
     */
    private String text;

    /**
     * Optional. Special entities that appear in the task text
     */
    @JsonProperty("text_entities")
    private List<MessageEntity> textEntities;

    /**
     * Optional. User that completed the task; omitted if the task wasn't completed
     */
    @JsonProperty("completed_by_user")
    private User completedByUser;

    /**
     * Optional. Point in time (Unix timestamp) when the task was completed; 0 if the task wasn't completed
     */
    @JsonProperty("completion_date")
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime completionDate;
}
