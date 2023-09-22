package resnyx.stickers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to get a sticker set. On success, a {@link StickerSet} object is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetStickerSet implements TgMethod {

    /**
     * Name of the sticker set
     */
    private final String name;

}
