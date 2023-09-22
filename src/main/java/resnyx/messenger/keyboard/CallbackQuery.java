package resnyx.messenger.keyboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Message;
import resnyx.messenger.general.User;

/**
 * This object represents an incoming callback query from a callback button in an inline keyboard.
 * If the button that originated the query was attached to a message sent by the bot, the field message will be present.
 * If the button was attached to a message sent via the bot (in inline mode), the field inline_message_id will be present.
 * Exactly one of the fields data or game_short_name will be present.
 */
@Data
@NoArgsConstructor
public final class CallbackQuery {

    /**
     * Unique identifier for this query
     */
    private String id;

    /**
     * Sender
     */
    private User from;

    /**
     * Optional. Message with the callback button that originated the query.
     * Note that message content and message date will not be available if the message is too old
     */
    private Message message;

    /**
     * Optional. Identifier of the message sent via the bot in inline mode, that originated the query.
     */
    @JsonProperty("inline_message_id")
    private String inlineMessageId;

    /**
     * Global identifier, uniquely corresponding to the chat to which the message with the callback button was sent.
     * Useful for high scores in games.
     */
    @JsonProperty("chat_instance")
    private String chatInstance;

    /**
     * Optional. Data associated with the callback button.
     * Be aware that the message originated the query can contain no callback buttons with this data.
     */
    private String data;

    /**
     * Optional. Short name of a Game to be returned, serves as the unique identifier for the game
     */
    @JsonProperty("game_short_name")
    private String gameShortName;
}
