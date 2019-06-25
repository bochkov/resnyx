package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represents one button of an inline keyboard. You must use exactly one of the optional fields.
 */
@Data
public final class InlineKeyboardButton {

    /**
     * Label text on the button
     */
    private String text;

    /**
     * Optional. HTTP or tg:// url to be opened when button is pressed
     */
    private String url;

    /**
     * Optional. An HTTP URL used to automatically authorize the user.
     * Can be used as a replacement for the
     * <a href="https://core.telegram.org/widgets/login">Telegram Login Widget</a>.
     */
    @JsonProperty("login_url")
    private LoginUrl loginUrl;

    /**
     * Optional. Data to be sent in a <a href="https://core.telegram.org/bots/api#callbackquery">callback query</a>
     * to the bot when button is pressed, 1-64 bytes
     */
    @JsonProperty("callback_data")
    private String callbackData;

    /**
     * Optional. If set, pressing the button will prompt the user to select one of their chats,
     * open that chat and insert the bot‘s username and the specified inline query in the input field.
     * Can be empty, in which case just the bot’s username will be inserted.
     * <p>
     * Note: This offers an easy way for users to start using your bot in inline mode when
     * they are currently in a private chat with it. Especially useful when combined with
     * switch_pm… actions – in this case the user will be automatically returned to the chat
     * they switched from, skipping the chat selection screen.
     */
    @JsonProperty("switch_inline_query")
    private String switchInline;

    /**
     * Optional. If set, pressing the button will insert the bot‘s username and the specified inline query
     * in the current chat's input field. Can be empty, in which case only the bot’s username will be inserted.
     * <p>
     * This offers a quick way for the user to open your bot in inline mode in the same chat – good for
     * selecting something from multiple options.
     */
    @JsonProperty("switch_inline_query_current_chat")
    private String swithInlineCurrent;

    /**
     * Optional. Description of the game that will be launched when the user presses the button.
     * <p>
     * NOTE: This type of button must always be the first button in the first row.
     */
    @JsonProperty("callback_game")
    private CallbackGame callbackGame;

    /**
     * Optional. Specify True, to send a <a href="https://core.telegram.org/bots/api#payments">Pay button</a>.
     * <p>
     * NOTE: This type of button must always be the first button in the first row.
     */
    private Boolean pay;
}
