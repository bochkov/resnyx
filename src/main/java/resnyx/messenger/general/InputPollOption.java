package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.ParseMode;

import java.util.List;

/**
 * This object contains information about one answer option in a poll to send.
 */
@Data
@NoArgsConstructor
public final class InputPollOption {

    /**
     * Option text, 1-100 characters
     */
    private String text;

    /**
     * Optional. Mode for parsing entities in the text.
     * See formatting options for more details.
     * Currently, only custom emoji entities are allowed
     */
    @JsonProperty("text_parse_mode")
    private ParseMode parseMode;

    /**
     * Optional. A JSON-serialized list of special entities that appear in the poll option text.
     * It can be specified instead of text_parse_mode
     */
    @JsonProperty("text_entities")
    private List<MessageEntity> entities;
}
