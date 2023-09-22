package resnyx.messenger.botcommand;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents the scope of bot commands, covering a specific member of a group or supergroup chat.
 */
@Data
@NoArgsConstructor
public final class BotCommandScopeChatMember implements BotCommandScope {

    /**
     * Scope type, must be chat_member
     */
    private String type;

    /**
     * Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     */
    @JsonProperty("chat_id")
    private String chatId;

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Long userId;
}
