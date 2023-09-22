package resnyx.stickers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to delete a sticker from a set created by the bot. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class DeleteStickerFromSet implements TgMethod {

    /**
     * File identifier of the sticker
     */
    public final String sticker;

}
