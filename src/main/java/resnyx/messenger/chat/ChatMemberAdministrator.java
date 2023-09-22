package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;

/**
 * Represents a chat member that has some additional privileges.
 */
@Data
@NoArgsConstructor
public final class ChatMemberAdministrator implements ChatMember {

    /**
     * The member's status in the chat, always “administrator”
     */
    private String status;

    /**
     * Information about the user
     */
    private User user;

    /**
     * True, if the bot is allowed to edit administrator privileges of that user
     */
    @JsonProperty("can_be_edited")
    private Boolean canBeEdited;

    @JsonUnwrapped
    private ChatAdministratorRights rights;

    /**
     * Optional. Custom title for this user
     */
    @JsonProperty("custom_title")
    private Boolean customTitle;
}
