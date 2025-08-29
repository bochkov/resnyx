package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to decline a suggested post in a direct messages chat.
 * The bot must have the 'can_manage_direct_messages' administrator right in the corresponding channel chat.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class DeclineSuggestedPost implements TgMethod {

    /**
     * Unique identifier for the target direct messages chat
     */
    @JsonProperty("chat_id")
    private final Long chatId;

    /**
     * Identifier of a suggested post message to decline
     */
    @JsonProperty("message_id")
    private final Long messageId;

    /**
     * Comment for the creator of the suggested post; 0-128 characters
     */
    private String comment;
}
