package resnyx.messenger.botcommand;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    /**
     * Optional. True, if the command sends an ephemeral message,
     * which can be seen only by the sender of the message and the bot
     */
    @JsonProperty("is_ephemeral")
    private Boolean isEphemeral;
}
