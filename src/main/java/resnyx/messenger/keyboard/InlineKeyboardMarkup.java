package resnyx.messenger.keyboard;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

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
