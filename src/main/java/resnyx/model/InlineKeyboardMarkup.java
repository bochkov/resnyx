package resnyx.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represents an inline keyboard that appears right next to the message it belongs to.
 */
@Data
public final class InlineKeyboardMarkup {

    /**
     * Array of button rows, each represented by an Array of InlineKeyboardButton objects
     */
    @JsonProperty("inline_keyboard")
    private List<List<InlineKeyboardButton>> keyboard;
}
