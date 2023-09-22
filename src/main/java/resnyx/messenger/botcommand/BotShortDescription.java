package resnyx.messenger.botcommand;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents the bot's short description.
 */
@Data
@NoArgsConstructor
public final class BotShortDescription {

    /**
     * The bot's short description
     */
    @JsonProperty("short_description")
    private String shortDescription;
}
