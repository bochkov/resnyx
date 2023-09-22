package resnyx.games;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to get data for high score tables.
 * Will return the score of the specified user and several of their neighbors in a game.
 * Returns an Array of GameHighScore objects.
 * <p>
 * This method will currently return scores for the target user, plus two of their closest neighbors on each side.
 * Will also return the top three users if the user and their neighbors are not among them.
 * Please note that this behavior is subject to change.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetGameHighScores implements TgMethod {

    /**
     * Target user id
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * Unique identifier for the target chat
     */
    @JsonProperty("chat_id")
    private final Long chatId;

    /**
     * Identifier of the sent message
     */
    @JsonProperty("message_id")
    private final Long messageId;


}
