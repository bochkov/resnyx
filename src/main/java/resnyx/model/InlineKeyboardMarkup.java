package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

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
