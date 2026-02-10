package resnyx.messenger.keyboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.WebAppInfo;
import resnyx.games.CallbackGame;

/**
 * This object represents one button of an inline keyboard.
 * Exactly one of the fields other than text, icon_custom_emoji_id, and style
 * must be used to specify the type of the button.
 */
@Data
@NoArgsConstructor
public final class InlineKeyboardButton {

    /**
     * Label text on the button
     */
    private String text;

    /**
     * Optional. Unique identifier of the custom emoji shown before the text of the button.
     * Can only be used by bots that purchased additional usernames on <a href="https://fragment.com/">Fragment</a>
     * or in the messages directly sent by the bot to private, group and supergroup chats
     * if the owner of the bot has a Telegram Premium subscription.
     */
    @JsonProperty("icon_custom_emoji_id")
    private String iconCustomEmojiId;

    /**
     * Optional. Style of the button. Must be one of “danger” (red), “success” (green) or “primary” (blue).
     * If omitted, then an app-specific style is used.
     */
    private String style;

    /**
     * Optional. HTTP or tg:// URL to be opened when the button is pressed.
     * Links <code>tg://user?id=&lt;user_id&gt;</code> can be used to mention a user by their ID without using a username,
     * if this is allowed by their privacy settings.
     */
    private String url;

    /**
     * Optional. Data to be sent in a callback query to the bot when button is pressed, 1-64 bytes
     */
    @JsonProperty("callback_data")
    private String callbackData;

    /**
     * Optional. Description of the Web App that will be launched when the user presses the button.
     * The Web App will be able to send an arbitrary message on behalf of the user using the method answerWebAppQuery.
     * Available only in private chats between a user and the bot.
     */
    @JsonProperty("web_app")
    private WebAppInfo webAppInfo;

    /**
     * Optional. An HTTPS URL used to automatically authorize the user.
     * Can be used as a replacement for the Telegram Login Widget.
     */
    @JsonProperty("login_url")
    private LoginUrl loginUrl;

    /**
     * Optional. If set, pressing the button will prompt the user to select one of their chats,
     * open that chat and insert the bot's username and the specified inline query in the input field.
     * May be empty, in which case just the bot's username will be inserted.
     */
    @JsonProperty("switch_inline_query")
    private String switchInlineQuery;

    /**
     * Optional. If set, pressing the button will insert the bot's username and the specified inline query in the current chat's input field.
     * May be empty, in which case only the bot's username will be inserted.
     * <p>
     * This offers a quick way for the user to open your bot in inline mode in the same chat - good for selecting something from multiple options.
     */
    @JsonProperty("switch_inline_query_current_chat")
    private String switchInlineQueryCurrentChat;

    /**
     * Optional. If set, pressing the button will prompt the user to select one of their chats of the specified type,
     * open that chat and insert the bot's username and the specified inline query in the input field
     */
    @JsonProperty("switch_inline_query_chosen_chat")
    private SwitchInlineQueryChosenChat switchInlineQueryChosenChat;

    /**
     * Optional. Description of the button that copies the specified text to the clipboard.
     */
    @JsonProperty("copy_text")
    private CopyTextButton copyText;

    /**
     * Optional. Description of the game that will be launched when the user presses the button.
     * <p>
     * NOTE: This type of button must always be the first button in the first row.
     */
    @JsonProperty("callback_game")
    private CallbackGame callbackGame;

    /**
     * Optional. Specify True, to send a Pay button.
     * <p>
     * NOTE: This type of button must always be the first button in the first row and can only be used in invoice messages.
     */
    private Boolean pay;
}
