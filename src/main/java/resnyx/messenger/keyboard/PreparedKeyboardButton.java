package resnyx.messenger.keyboard;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes a keyboard button to be used by a user of a Mini App.
 */
@Data
@NoArgsConstructor
public final class PreparedKeyboardButton {

    /**
     * Unique identifier of the keyboard button
     */
    private String id;
}
