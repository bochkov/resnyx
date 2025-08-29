package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;
import resnyx.util.UnixTimeDeserializer;

import java.time.LocalDate;

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

    /**
     * Optional. Date when the user's subscription will expire; Unix time
     */
    @JsonProperty("until_date")
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDate untilDate;

}
