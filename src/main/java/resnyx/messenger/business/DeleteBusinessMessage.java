package resnyx.messenger.business;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

import java.util.List;

/**
 * Delete messages on behalf of a business account.
 * Requires the <i>can_delete_outgoing_messages</i> business bot right to delete messages sent by the bot itself,
 * or the <i>can_delete_all_messages</i> business bot right to delete any message.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class DeleteBusinessMessage implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which to read the message
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;

    /**
     * A JSON-serialized list of 1-100 identifiers of messages to delete.
     * All messages must be from the same chat.
     * See {@link resnyx.messenger.general.DeleteMessage} for limitations on which messages can be deleted
     */
    @JsonProperty("message_ids")
    private final List<Long> messageIds;
}
