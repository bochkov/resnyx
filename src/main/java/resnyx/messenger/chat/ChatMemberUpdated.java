package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Chat;
import resnyx.messenger.general.User;
import resnyx.util.UnixTimeDeserializer;

import java.time.LocalDateTime;

/**
 * This object represents changes in the status of a chat member.
 */
@Data
@NoArgsConstructor
public final class ChatMemberUpdated {

    /**
     * Chat the user belongs to
     */
    private Chat chat;

    /**
     * Performer of the action, which resulted in the change
     */
    private User from;

    /**
     * Date the change was done in Unix time
     */
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime date;

    /**
     * Previous information about the chat member
     */
    @JsonProperty("old_chat_member")
    private ChatMember oldChatMember;

    /**
     * New information about the chat member
     */
    @JsonProperty("new_chat_member")
    private ChatMember newChatMember;

    /**
     * Optional. Chat invite link, which was used by the user to join the chat; for joining by invite link events only.
     */
    @JsonProperty("invite_link")
    private ChatInviteLink inviteLink;

    /**
     * Optional. True, if the user joined the chat after sending a direct join request without using an invite link and being approved by an administrator
     */
    @JsonProperty("via_join_request")
    private Boolean viaJoinRequest;

    /**
     * Optional. True, if the user joined the chat via a chat folder invite link
     */
    @JsonProperty("via_chat_folder_invite_link")
    private Boolean viaChatFolderInviteLink;
}
