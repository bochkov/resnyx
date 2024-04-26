package resnyx.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to replace an existing sticker in a sticker set with a new one.
 * The method is equivalent to calling {@link DeleteStickerFromSet}, then {@link AddStickerToSet}, then {@link SetStickerPositionInSet}.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class ReplaceStickerInSet implements TgMethod {

    /**
     * User identifier of the sticker set owner
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * Sticker set name
     */
    private final String name;

    /**
     * File identifier of the replaced sticker
     */
    @JsonProperty("old_sticker")
    private final String oldSticker;

    /**
     * A JSON-serialized object with information about the added sticker.
     * If exactly the same sticker had already been added to the set, then the set remains unchanged.
     */
    private final InputSticker sticker;
}
