package resnyx.messenger.keyboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.WebAppInfo;

/**
 * This object represents one button of the reply keyboard.
 * At most one of the fields other than text, icon_custom_emoji_id, and style must be used to specify the type of the button.
 * For simple text buttons, String can be used instead of this object to specify the button text.
 */
@Data
@NoArgsConstructor
public final class KeyboardButton {

    /**
     * Text of the button. If none of the optional fields are used, it will be sent as a message when the button is pressed
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
     * Optional. If specified, pressing the button will open a list of suitable users.
     * Tapping on any user will send their identifier to the bot in a “user_shared” service message.
     * Available in private chats only.
     */
    @JsonProperty("request_users")
    private KeyboardButtonRequestUsers requestUsers;

    /**
     * Optional. If specified, pressing the button will open a list of suitable chats.
     * Tapping on a chat will send its identifier to the bot in a “chat_shared” service message.
     * Available in private chats only.
     */
    @JsonProperty("request_chat")
    private KeyboardButtonRequestChat requestChat;

    /**
     * Optional. If True, the user's phone number will be sent as a contact when the button is pressed.
     * Available in private chats only.
     */
    @JsonProperty("request_contact")
    private Boolean requestContact;

    /**
     * Optional. If True, the user's current location will be sent when the button is pressed.
     * Available in private chats only.
     */
    @JsonProperty("request_location")
    private Boolean requestLocation;

    /**
     * Optional. If specified, the user will be asked to create a poll and send it to the bot when the button is pressed.
     * Available in private chats only.
     */
    @JsonProperty("request_poll")
    private KeyboardButtonPollType requestPoll;

    /**
     * Optional. If specified, the described Web App will be launched when the button is pressed.
     * The Web App will be able to send a “web_app_data” service message. Available in private chats only.
     */
    @JsonProperty("web_app_info")
    private WebAppInfo webAppInfo;
}
