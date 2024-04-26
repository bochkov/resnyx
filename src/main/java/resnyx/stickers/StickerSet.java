package resnyx.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.PhotoSize;

import java.util.List;

/**
 * This object represents a sticker set.
 */
@Data
@NoArgsConstructor
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
     * Type of stickers in the set, currently one of “regular”, “mask”, “custom_emoji”
     */
    private StickerType type;

    /**
     * List of all set stickers
     */
    @JsonProperty("stickers")
    private List<Sticker> stickers;

    /**
     * Optional. Sticker set thumbnail in the .WEBP, .TGS, or .WEBM format
     */
    private PhotoSize thumbnail;
}
