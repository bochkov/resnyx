package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * This object contains information about the users whose identifiers were shared with the bot
 * using a {@link resnyx.messenger.keyboard.KeyboardButtonRequestUsers} button.
 */
@Data
@NoArgsConstructor
public final class UsersShared {

    /**
     * Identifier of the request
     */
    @JsonProperty("request_id")
    private Integer requestId;

    /**
     * Information about users shared with the bot.
     */
    @JsonProperty("user_ids")
    private List<SharedUser> userIds;
}
