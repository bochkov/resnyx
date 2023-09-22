package resnyx.messenger.botcommand;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents the default scope of bot commands. Default commands are used if no commands with a narrower scope are specified for the user.
 */
@Data
@NoArgsConstructor
public final class BotCommandScopeDefault implements BotCommandScope {

    /**
     * Scope type, must be default
     */
    private String type;
}
