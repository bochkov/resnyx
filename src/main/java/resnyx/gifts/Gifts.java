package resnyx.gifts;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * This object represent a list of gifts.
 */
@Data
@NoArgsConstructor
public final class Gifts {

    /**
     * The list of gifts
     */
    private List<Gift> gifts;
}
