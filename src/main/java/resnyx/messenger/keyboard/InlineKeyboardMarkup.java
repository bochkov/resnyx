package resnyx.messenger.keyboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * This object represents an inline keyboard that appears right next to the message it belongs to.
 */
@Data
@NoArgsConstructor
public final class InlineKeyboardMarkup implements ReplyMarkup {

    /**
     * Array of button rows, each represented by an Array of InlineKeyboardButton objects
     */
    @JsonProperty("inline_keyboard")
    private List<List<InlineKeyboardButton>> inlineKeyboard;
}
