package resnyx.stickers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to move a sticker in a set created by the bot to a specific position. Returns True on success
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetStickerPositionInSet implements TgMethod {

    /**
     * File identifier of the sticker
     */
    private final String sticker;

    /**
     * New sticker position in the set, zero-based
     */
    private final Integer position;

}
