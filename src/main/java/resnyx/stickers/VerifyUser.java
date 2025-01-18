package resnyx.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Verifies a user on behalf of the organization which is represented by the bot. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class VerifyUser implements TgMethod {

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * Custom description for the verification; 0-70 characters.
     * Must be empty if the organization isn't allowed to provide a custom verification description.
     */
    @JsonProperty("custom_description")
    private String customDescription;

}
