package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Represents a Game.
 */
@Data
@NoArgsConstructor
public final class InlineQueryResultGame implements InlineQueryResult {

    /**
     * Type of the result, must be game
     */
    private String type;

    /**
     * Unique identifier for this result, 1-64 bytes
     */
    private String id;

    /**
     * Short name of the game
     */
    @JsonProperty("game_short_name")
    private String gameShortName;

    /**
     * Optional. Inline keyboard attached to the message
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

}
