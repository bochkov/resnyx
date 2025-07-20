package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Describes a service message about checklist tasks marked as done or not done.
 */
@Data
@NoArgsConstructor
public final class ChecklistTasksDone {

    /**
     * Optional. Message containing the checklist whose tasks were marked as done or not done.
     * Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
     */
    @JsonProperty("checklist_message")
    private Message checklistMessage;

    /**
     * Optional. Identifiers of the tasks that were marked as done
     */
    @JsonProperty("marked_as_done_task_ids")
    private List<Integer> markedAsDoneTaskIds;

    /**
     * Optional. Identifiers of the tasks that were marked as not done
     */
    @JsonProperty("marked_as_not_done_task_ids")
    private List<Integer> markedAsNotDoneTaskIds;

}
