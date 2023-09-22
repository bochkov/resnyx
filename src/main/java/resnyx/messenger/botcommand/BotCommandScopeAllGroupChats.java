package resnyx.messenger.botcommand;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents the scope of bot commands, covering all group and supergroup chats.
 */
@Data
@NoArgsConstructor
public final class BotCommandScopeAllGroupChats implements BotCommandScope {

    /**
     * Scope type, must be all_group_chats
     */
    private String type;
}
