package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents an animated emoji that displays a random value.
 */
@Data
@NoArgsConstructor
public final class Dice {

    /**
     * Emoji on which the dice throw animation is based
     */
    private String emoji;

    /**
     * Value of the dice,
     * 1-6 for “🎲”, “🎯” and “🎳” base emoji,
     * 1-5 for “🏀” and “⚽” base emoji,
     * 1-64 for “🎰” base emoji
     */
    private Integer value;
}
