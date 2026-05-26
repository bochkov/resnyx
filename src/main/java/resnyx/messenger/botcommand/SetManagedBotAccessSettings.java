package resnyx.messenger.botcommand;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

import java.util.List;

/**
 * Use this method to change the access settings of a managed bot. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetManagedBotAccessSettings implements TgMethod {

    /**
     * User identifier of the managed bot whose access settings will be changed
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * Pass True, if only selected users can access the bot. The bot's owner can always access it.
     */
    @JsonProperty("is_access_restricted")
    private final Boolean isAccessRestricted;

    /**
     * A JSON-serialized list of up to 10 identifiers of users who will have access to the bot in addition to its owner.
     * Ignored if is_access_restricted is false.
     */
    @JsonProperty("added_user_ids")
    private List<Long> addedUserIds;
}
