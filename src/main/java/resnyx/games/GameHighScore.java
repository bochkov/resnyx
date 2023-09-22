package resnyx.games;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;

/**
 * This object represents one row of the high scores table for a game.
 */
@Data
@NoArgsConstructor
public final class GameHighScore {

    /**
     * Position in high score table for the game
     */
    private Integer position;

    /**
     * User
     */
    private User user;

    /**
     * Score
     */
    private Integer score;
}
