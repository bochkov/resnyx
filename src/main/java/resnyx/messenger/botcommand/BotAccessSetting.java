package resnyx.messenger.botcommand;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;

import java.util.List;

/**
 * This object describes the access settings of a bot.
 */
@Data
@NoArgsConstructor
public final class BotAccessSetting {

    /**
     * True, if only selected users can access the bot. The bot's owner can always access it.
     */
    @JsonProperty("is_access_restricted")
    private Boolean isAccessRestricted;

    /**
     * Optional. The list of other users who have access to the bot if the access is restricted
     */
    @JsonProperty("added_users")
    private List<User> addedUsers;
}
