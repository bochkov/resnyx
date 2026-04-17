package resnyx.messenger.keyboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Stores a keyboard button that can be used by a user within a Mini App.
 * Returns a {@link PreparedKeyboardButton} object.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SavePreparedKeyboardButton implements TgMethod {

    /**
     * Unique identifier of the target user that can use the button
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * A JSON-serialized object describing the button to be saved.
     * The button must be of the type request_users, request_chat, or request_managed_bot
     */
    private final KeyboardButton button;
}
