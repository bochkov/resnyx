package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Chat;
import resnyx.messenger.general.User;
import resnyx.util.UnixTimeDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;

/**
 * Represents a join request sent to a chat.
 */
@Data
@NoArgsConstructor
public final class ChatJoinRequest {

    /**
     * Chat to which the request was sent
     */
    private Chat chat;

    /**
     * User that sent the join request
     */
    private User from;

    /**
     * Identifier of a private chat with the user who sent the join request.
     * This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it.
     * But it has at most 52 significant bits, so a 64-bit integer or double-precision float type are safe for storing this identifier.
     * The bot can use this identifier for 24 hours to send messages until the join request is processed, assuming no other administrator contacted the user.
     */
    @JsonProperty("user_chat_id")
    private Long userChatId;

    /**
     * Date the request was sent in Unix time
     */
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime date;

    /**
     * Optional. Bio of the user.
     */
    private String bio;

    /**
     * Optional. Chat invite link that was used by the user to send the join request
     */
    @JsonProperty("invite_link")
    private ChatInviteLink inviteLink;
}
