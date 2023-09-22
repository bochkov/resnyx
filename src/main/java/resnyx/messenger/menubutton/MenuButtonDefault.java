package resnyx.messenger.menubutton;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes that no specific value for the menu button was set.
 */
@Data
@NoArgsConstructor
public final class MenuButtonDefault implements MenuButton {

    /**
     * Type of the button, must be default
     */
    private String type;
}
