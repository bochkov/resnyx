package resnyx.games;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to set the score of the specified user in a game message.
 * On success the Message is returned.
 * Returns an error, if the new score is not greater than the user's current score in the chat and force is False.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetGameScore implements TgMethod {

    /**
     * Unique identifier for the target chat
     */
    @JsonProperty("chat_id")
    private final Long chatId;

    /**
     * User identifier
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * Identifier of the sent message
     */
    @JsonProperty("message_id")
    private final Long messageId;

    /**
     * New score, must be non-negative
     */
    private final Integer score;

    /**
     * Pass True if the high score is allowed to decrease.
     * This can be useful when fixing mistakes or banning cheaters
     */
    private Boolean force;

    /**
     * Pass True if the game message should not be automatically edited to include the current scoreboard
     */
    @JsonProperty("disable_edit_message")
    private Boolean disableEditMessage;

}
