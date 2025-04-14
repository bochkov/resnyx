package resnyx.messenger.business;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Marks incoming message as read on behalf of a business account.
 * Requires the can_read_messages business bot right.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class ReadBusinessMessage implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which to read the message
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;

    /**
     * Unique identifier of the chat in which the message was received.
     * The chat must have been active in the last 24 hours.
     */
    @JsonProperty("chat_id")
    private final Long chatId;

    /**
     * Unique identifier of the message to mark as read
     */
    @JsonProperty("message_id")
    private final Long messageId;
}
