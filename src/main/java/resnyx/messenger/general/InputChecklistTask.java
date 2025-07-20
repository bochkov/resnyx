package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.ParseMode;

import java.util.List;

/**
 * Describes a task to add to a checklist.
 */
@Data
@NoArgsConstructor
public final class InputChecklistTask {

    /**
     * Unique identifier of the task; must be positive and unique among all task identifiers currently present in the checklist
     */
    private Integer id;

    /**
     * Text of the task; 1-100 characters after entities parsing
     */
    private String text;

    /**
     * Optional. Mode for parsing entities in the text. See formatting options for more details.
     */
    @JsonProperty("parse_mode")
    private ParseMode parseMode;

    /**
     * Optional. List of special entities that appear in the text, which can be specified instead of parse_mode.
     * Currently, only bold, italic, underline, strikethrough, spoiler, and custom_emoji entities are allowed.
     */
    @JsonProperty("text_entities")
    private List<MessageEntity> textEntities;



}
