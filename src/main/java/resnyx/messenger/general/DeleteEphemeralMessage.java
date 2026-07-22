package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to delete an ephemeral message.
 * Note that it is not guaranteed that the user will receive the message deletion event, especially if they are offline.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class DeleteEphemeralMessage implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target supergroup in the format @username
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Identifier of the user who received the message
     */
    @JsonProperty("receiver_user_id")
    private final Long receiverUserId;

    /**
     * Identifier of the ephemeral message to delete
     */
    @JsonProperty("ephemeral_message_id")
    private final Long ephemeralMessageId;
}
