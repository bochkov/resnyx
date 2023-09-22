package resnyx.messenger.botcommand;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents the scope of bot commands, covering all administrators of a specific group or supergroup chat.
 */
@Data
@NoArgsConstructor
public final class BotCommandScopeChatAdministrators implements BotCommandScope {

    /**
     * Scope type, must be chat_administrators
     */
    private String type;

    /**
     * Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     */
    @JsonProperty("chat_id")
    private String chatId;
}
