package resnyx.messenger.keyboard;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents a custom keyboard with reply options (see Introduction to bots for details and examples).
 */
@Data
@NoArgsConstructor
public final class ReplyKeyboardMarkup implements ReplyMarkup {

    /**
     * Array of button rows, each represented by an Array of KeyboardButton objects
     */
    private List<List<KeyboardButton>> keyboard;

    /**
     * Optional. Requests clients to always show the keyboard when the regular keyboard is hidden.
     * Defaults to false, in which case the custom keyboard can be hidden and opened with a keyboard icon.
     */
    @JsonProperty("is_persistent")
    private Boolean isPersistent;

    /**
     * Optional. Requests clients to resize the keyboard vertically for optimal fit (e.g., make the keyboard smaller if there are just two rows of buttons).
     * Defaults to false, in which case the custom keyboard is always of the same height as the app's standard keyboard.
     */
    @JsonProperty("resize_keyboard")
    private Boolean resizeKeyboard;

    /**
     * Optional. Requests clients to hide the keyboard as soon as it's been used.
     * The keyboard will still be available, but clients will automatically display the usual letter-keyboard
     * in the chat - the user can press a special button in the input field to see the custom keyboard again.
     * Defaults to false.
     */
    @JsonProperty("one_time_keyboard")
    private Boolean oneTimeKeyboard;

    /**
     * Optional. The placeholder to be shown in the input field when the keyboard is active; 1-64 characters
     */
    @JsonProperty("input_field_placeholder")
    private String inputFieldPlaceholder;

    /**
     * Optional. Use this parameter if you want to show the keyboard to specific users only.
     * Targets: 1) users that are @mentioned in the text of the Message object; 2) if the bot's message is a reply (has reply_to_message_id), sender of the original message.
     * <p>
     * Example: A user requests to change the bot's language, bot replies to the request with a keyboard to select the new language.
     * Other users in the group don't see the keyboard.
     */
    private Boolean selective;
}
