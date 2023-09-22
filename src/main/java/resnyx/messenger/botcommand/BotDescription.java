package resnyx.messenger.botcommand;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents the bot's description.
 */
@Data
@NoArgsConstructor
public final class BotDescription {

    /**
     * The bot's description
     */
    private String description;
}
