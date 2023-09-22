package resnyx.messenger.menubutton;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a menu button, which opens the bot's list of commands.
 */
@Data
@NoArgsConstructor
public final class MenuButtonCommands implements MenuButton {

    /**
     * Type of the button, must be commands
     */
    private String type;
}
