package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * This object is received when messages are deleted from a connected business account.
 */
@Data
@NoArgsConstructor
public final class BusinessMessagesDeleted {

    /**
     * Unique identifier of the business connection
     */
    @JsonProperty("business_connection_id")
    private String businessConnectionId;

    /**
     * Information about a chat in the business account.
     * The bot may not have access to the chat or the corresponding user.
     */
    private Chat chat;

    /**
     * A JSON-serialized list of identifiers of deleted messages in the chat of the business account
     */
    @JsonProperty("message_ids")
    private List<Long> messageIds;
}
