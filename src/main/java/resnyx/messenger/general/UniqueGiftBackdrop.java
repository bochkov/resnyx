package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object describes the backdrop of a unique gift.
 */
@Data
@NoArgsConstructor
public final class UniqueGiftBackdrop {

    /**
     * Name of the backdrop
     */
    private String name;

    /**
     * Colors of the backdrop
     */
    private UniqueGiftBackdropColors colors;

    /**
     * The number of unique gifts that receive this backdrop for every 1000 gifts upgraded
     */
    @JsonProperty("rarity_per_mille")
    private Integer rarityPerMille;
}
