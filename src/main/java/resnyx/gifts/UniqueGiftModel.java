package resnyx.gifts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.stickers.Sticker;

/**
 * This object describes the model of a unique gift.
 */
@Data
@NoArgsConstructor
public final class UniqueGiftModel {

    /**
     * Name of the model
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

    /**
     * Optional. Rarity of the model if it is a crafted model.
     * Currently, can be “uncommon”, “rare”, “epic”, or “legendary”.
     */
    private String rarity;
}
