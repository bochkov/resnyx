package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A bot command.
 */
@Data
@NoArgsConstructor
public final class RichTextBotCommand implements RichText {

    /**
     * Type of the rich text, always “bot_command”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;

    /**
     * The bot command
     */
    @JsonProperty("bot_command")
    private String botCommand;
}
