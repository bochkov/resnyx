package resnyx.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to add a new sticker to a set created by the bot.
 * The format of the added sticker must match the format of the other stickers in the set.
 * Emoji sticker sets can have up to 200 stickers.
 * Animated and video sticker sets can have up to 50 stickers.
 * Static sticker sets can have up to 120 stickers.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class AddStickerToSet implements TgMethod {

    /**
     * User identifier of sticker set owner
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * Sticker set name
     */
    private final String name;

    /**
     * A JSON-serialized object with information about the added sticker.
     * If exactly the same sticker had already been added to the set, then the set isn't changed.
     */
    private final InputSticker sticker;

}
