package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.ChatType;
import resnyx.messenger.general.Location;
import resnyx.messenger.general.User;

/**
 *
 */
@Data
@NoArgsConstructor
public final class InlineQuery {

    /**
     * Unique identifier for this query
     */
    private String id;

    /**
     * Sender
     */
    private User from;

    /**
     * Text of the query (up to 256 characters)
     */
    private String query;

    /**
     * Offset of the results to be returned, can be controlled by the bot
     */
    private String offset;

    /**
     * Optional. Type of the chat from which the inline query was sent.
     * Can be either “sender” for a private chat with the inline query sender, “private”, “group”, “supergroup”, or “channel”.
     * The chat type should be always known for requests sent from official clients and most third-party clients, unless the request was sent from a secret chat
     */
    @JsonProperty("chat_type")
    private ChatType chatType;

    /**
     * Optional. Sender location, only for bots that request user location
     */
    private Location location;
}
