package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;

/**
 * Represents a chat member that owns the chat and has all administrator privileges.
 */
@Data
@NoArgsConstructor
public final class ChatMemberOwner implements ChatMember {

    /**
     * The member's status in the chat, always “creator”
     */
    private String status;

    /**
     * Information about the user
     */
    private User user;

    /**
     * True, if the user's presence in the chat is hidden
     */
    @JsonProperty("is_anonymous")
    private Boolean isAnonymous;

    /**
     * Optional. Custom title for this user
     */
    @JsonProperty("custom_title")
    private String customTitle;
}
