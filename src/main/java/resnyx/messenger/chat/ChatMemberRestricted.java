package resnyx.messenger.chat;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;
import resnyx.util.UnixTimeDeserializer;

/**
 * Represents a chat member that is under certain restrictions in the chat. Supergroups only.
 */
@Data
@NoArgsConstructor
public final class ChatMemberRestricted implements ChatMember {

    /**
     * The member's status in the chat, always “restricted”
     */
    private String status;

    /**
     * Information about the user
     */
    private User user;

    /**
     * True, if the user is a member of the chat at the moment of the request
     */
    @JsonProperty("is_member")
    private Boolean isMember;

    @JsonUnwrapped
    private ChatPermissions chatPermissions;

    /**
     * Date when restrictions will be lifted for this user; Unix time. If 0, then the user is restricted forever
     */
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    @JsonProperty("until_date")
    private LocalDateTime untilDate;

}
