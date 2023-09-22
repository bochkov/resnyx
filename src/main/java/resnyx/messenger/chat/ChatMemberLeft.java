package resnyx.messenger.chat;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;

/**
 * Represents a chat member that isn't currently a member of the chat, but may join it themselves.
 */
@Data
@NoArgsConstructor
public final class ChatMemberLeft implements ChatMember {

    /**
     * The member's status in the chat, always “left”
     */
    private String status;

    /**
     * Information about the user
     */
    private User user;
}
