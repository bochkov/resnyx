package resnyx.messenger.chat;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;
import resnyx.util.UnixTimeDeserializer;

/**
 * Represents a chat member that was banned in the chat and can't return to the chat or view chat messages.
 */
@Data
@NoArgsConstructor
public final class ChatMemberBanned implements ChatMember {

    /**
     * The member's status in the chat, always “kicked”
     */
    private String status;

    /**
     * Information about the user
     */
    private User user;

    /**
     * Date when restrictions will be lifted for this user; Unix time. If 0, then the user is banned forever
     */
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    @JsonProperty("until_date")
    private LocalDateTime untilDate;
}
