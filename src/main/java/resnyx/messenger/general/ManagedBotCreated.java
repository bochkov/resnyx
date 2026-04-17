package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object contains information about the bot that was created to be managed by the current bot.
 */
@Data
@NoArgsConstructor
public final class ManagedBotCreated {

    /**
     * Information about the bot. The bot's token can be fetched using the method getManagedBotToken.
     */
    private User bot;
}
