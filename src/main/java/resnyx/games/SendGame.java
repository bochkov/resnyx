package resnyx.games;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.messenger.general.Message;

/**
 * Use this method to send a game. On success, the sent {@link Message} is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendGame implements TgMethod {

    /**
     * Unique identifier for the target chat
     */
    @JsonProperty("chat_id")
    private final Long chatId;

    /**
     * Short name of the game, serves as the unique identifier for the game.
     * Set up your games via @BotFather.
     */
    @JsonProperty("game_short_name")
    private final String gameShortName;


}
