package resnyx.messenger.keyboard;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.PollType;

/**
 * This object represents type of a poll, which is allowed to be created and sent when the corresponding button is pressed.
 */
@Data
@NoArgsConstructor
public final class KeyboardButtonPollType {

    /**
     * Optional. If quiz is passed, the user will be allowed to create only polls in the quiz mode.
     * If regular is passed, only regular polls will be allowed.
     * Otherwise, the user will be allowed to create a poll of any type.
     */
    private PollType type;
}
