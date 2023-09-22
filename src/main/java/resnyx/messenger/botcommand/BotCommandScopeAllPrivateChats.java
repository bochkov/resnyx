package resnyx.messenger.botcommand;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents the scope of bot commands, covering all private chats.
 */
@Data
@NoArgsConstructor
public final class BotCommandScopeAllPrivateChats implements BotCommandScope {

    /**
     * Scope type, must be all_private_chats
     */
    private String type;
}
