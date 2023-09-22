package resnyx.messenger.botcommand;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents a bot command.
 */
@Data
@NoArgsConstructor
public final class BotCommand {

    /**
     * Text of the command; 1-32 characters. Can contain only lowercase English letters, digits and underscores.
     */
    private String command;

    /**
     * Description of the command; 1-256 characters.
     */
    private String description;
}
