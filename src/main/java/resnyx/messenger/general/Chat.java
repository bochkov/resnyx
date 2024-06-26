package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents a chat.
 */
@Data
@NoArgsConstructor
public final class Chat {

    /**
     * Unique identifier for this chat.
     * This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it.
     * But it has at most 52 significant bits, so a signed 64-bit integer or double-precision float type are safe for storing this identifier.
     */
    private Long id;

    /**
     * Type of chat
     */
    private ChatType type;

    /**
     * Optional. Title, for supergroups, channels and group chats
     */
    private String title;

    /**
     * Optional. Username, for private chats, supergroups and channels if available
     */
    private String username;

    /**
     * Optional. First name of the other party in a private chat
     */
    @JsonProperty("first_name")
    private String firstName;

    /**
     * Optional. Last name of the other party in a private chat
     */
    @JsonProperty("last_name")
    private String lastName;

    /**
     * Optional. True, if the supergroup chat is a forum (has topics enabled)
     */
    @JsonProperty("is_forum")
    private Boolean isForum;

}
