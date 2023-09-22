package resnyx.messenger.botcommand;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents the scope of bot commands, covering all group and supergroup chat administrators.
 */
@Data
@NoArgsConstructor
public final class BotCommandScopeAllChatAdministrators implements BotCommandScope {

    /**
     * Scope type, must be all_chat_administrators
     */
    private String type;
}
