package resnyx.gifts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.stickers.Sticker;

/**
 * This object describes the symbol shown on the pattern of a unique gift.
 */
@Data
@NoArgsConstructor
public final class UniqueGiftSymbol {

    /**
     * Name of the symbol
     */
    private String name;

    /**
     * The sticker that represents the unique gift
     */
    private Sticker sticker;

    /**
     * The number of unique gifts that receive this model for every 1000 gifts upgraded
     */
    @JsonProperty("rarity_per_mille")
    private Integer rarityPerMille;
}
