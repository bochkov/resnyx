package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Describes a checklist.
 */
@Data
@NoArgsConstructor
public final class Checklist {

    /**
     * Title of the checklist
     */
    private String title;

    /**
     * Optional. Special entities that appear in the checklist title
     */
    @JsonProperty("title_entities")
    private List<MessageEntity> titleEntities;

    /**
     * List of tasks in the checklist
     */
    private List<ChecklistTask> tasks;

    /**
     * Optional. True, if users other than the creator of the list can add tasks to the list
     */
    @JsonProperty("others_can_add_tasks")
    private Boolean othersCanAddTasks;

    /**
     * Optional. True, if users other than the creator of the list can mark tasks as done or not done
     */
    @JsonProperty("others_can_mark_tasks_as_done")
    private Boolean othersCanMarkTasksAsDone;
}
