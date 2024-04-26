package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeSerializer;

import java.time.LocalDateTime;

/**
 * Describes the connection of the bot with a business account.
 */
@Data
@NoArgsConstructor
public final class BusinessConnection {

    /**
     * Unique identifier of the business connection
     */
    private String id;

    /**
     * Business account user that created the business connection
     */
    private User user;

    /**
     * Identifier of a private chat with the user who created the business connection.
     * This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it.
     * But it has at most 52 significant bits, so a 64-bit integer or double-precision float type are safe for storing this identifier.
     */
    @JsonProperty("user_id")
    private Long userId;

    /**
     * Date the connection was established in Unix time
     */
    @JsonSerialize(using = UnixTimeSerializer.class)
    private LocalDateTime date;

    /**
     * True, if the bot can act on behalf of the business account in chats that were active in the last 24 hours
     */
    @JsonProperty("can_reply")
    private Boolean canReply;

    /**
     * True, if the connection is active
     */
    @JsonProperty("is_enabled")
    private Boolean isEnabled;

}
