package resnyx.games;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.SendOptions;
import resnyx.messenger.general.Message;

/**
 * Use this method to send a game. On success, the sent {@link Message} is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendGame implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which the message will be sent
     */
    @JsonProperty("business_connection_id")
    private String businessConnectionId;

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

    @JsonUnwrapped
    private SendOptions sendOptions;

}
