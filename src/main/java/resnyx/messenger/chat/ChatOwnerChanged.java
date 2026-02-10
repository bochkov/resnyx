package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;

/**
 * Describes a service message about an ownership change in the chat.
 */
@Data
@NoArgsConstructor
public final class ChatOwnerChanged {

    /**
     * The new owner of the chat
     */
    @JsonProperty("new_owner")
    private User newOwner;
}
