package resnyx.stickers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.PhotoSize;

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
     * True, if the sticker set contains animated stickers
     */
    @JsonProperty("is_animated")
    private Boolean isAnimated;

    /**
     * True, if the sticker set contains video stickers
     */
    @JsonProperty("is_video")
    private Boolean isVideo;

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
