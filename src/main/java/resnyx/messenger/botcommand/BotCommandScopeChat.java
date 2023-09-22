package resnyx.messenger.botcommand;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents the scope of bot commands, covering a specific chat.
 */
@Data
@NoArgsConstructor
public final class BotCommandScopeChat implements BotCommandScope {

    /**
     * Scope type, must be chat
     */
    private String type;

    /**
     * Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     */
    @JsonProperty("chat_id")
    private String chatId;
}
