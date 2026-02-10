package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;

/**
 * Describes a service message about the chat owner leaving the chat.
 */
@Data
@NoArgsConstructor
public final class ChatOwnerLeft {

    /**
     * Optional. The user which will be the new owner of the chat if the previous owner does not return to the chat
     */
    @JsonProperty("new_owner")
    private User newOwner;
}
