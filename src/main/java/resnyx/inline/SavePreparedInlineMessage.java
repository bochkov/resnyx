package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Stores a message that can be sent by a user of a Mini App. Returns a {@link PreparedInlineMessage} object.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SavePreparedInlineMessage implements TgMethod {

    /**
     * Unique identifier of the target user that can use the prepared message
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * A JSON-serialized object describing the message to be sent
     */
    private final InlineQueryResult result;

    /**
     * Pass True if the message can be sent to private chats with users
     */
    @JsonProperty("allow_user_chats")
    private Boolean allowUserChats;

    /**
     * Pass True if the message can be sent to private chats with bots
     */
    @JsonProperty("allow_bot_chats")
    private Boolean allowBotChats;

    /**
     * Pass True if the message can be sent to group and supergroup chats
     */
    @JsonProperty("allow_group_chats")
    private Boolean allowGroupChats;

    /**
     * Pass True if the message can be sent to channel chats
     */
    @JsonProperty("allow_channel_chats")
    private Boolean allowChannelChats;
}
