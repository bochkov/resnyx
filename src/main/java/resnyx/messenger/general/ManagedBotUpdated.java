package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object contains information about the creation, token update, or owner update of a bot that is managed by the current bot.
 */
@Data
@NoArgsConstructor
public final class ManagedBotUpdated {

    /**
     * User that created the bot
     */
    private User user;

    /**
     * Information about the bot. Token of the bot can be fetched using the method getManagedBotToken.
     */
    private User bot;
}
