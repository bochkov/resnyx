package resnyx.messenger.chat;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;

/**
 * Represents a chat member that has no additional privileges or restrictions.
 */
@Data
@NoArgsConstructor
public final class ChatMemberMember implements ChatMember {

    /**
     * The member's status in the chat, always “member”
     */
    private String status;

    /**
     * Information about the user
     */
    private User user;

}
