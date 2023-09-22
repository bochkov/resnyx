package resnyx.stickers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to set the title of a created sticker set. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetStickerSetTitle implements TgMethod {

    /**
     * Sticker set name
     */
    private final String name;

    /**
     * Sticker set name
     */
    private final String title;

}
