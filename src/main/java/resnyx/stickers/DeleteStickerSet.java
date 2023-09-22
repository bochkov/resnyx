package resnyx.stickers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to delete a sticker set that was created by the bot. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class DeleteStickerSet implements TgMethod {

    /**
     * Sticker set name
     */
    private final String name;

}
