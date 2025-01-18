package resnyx.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Removes verification from a user who is currently verified on behalf of the organization represented by the bot.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class RemoveUserVerification implements TgMethod {

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private final Long userId;
}
