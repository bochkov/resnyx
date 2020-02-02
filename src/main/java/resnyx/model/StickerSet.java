package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * This object represents a sticker set.
 */
@Data
public final class StickerSet {

    /**
     * Sticker set name
     */
    private String name;

    /**
     * Sticker set title
     */
    private String title;

    /**
     * True, if the sticker set contains animated stickers
     */
    @JsonProperty("is_animated")
    private Boolean isAnimated;

    /**
     * True, if the sticker set contains masks
     */
    @JsonProperty("contains_masks")
    private Boolean containsMasks;

    /**
     * List of all set stickers
     */
    private List<Sticker> stickers;
}
