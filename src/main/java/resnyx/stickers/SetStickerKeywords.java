package resnyx.stickers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

import java.util.List;

/**
 * Use this method to change search keywords assigned to a regular or custom emoji sticker.
 * The sticker must belong to a sticker set created by the bot. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetStickerKeywords implements TgMethod {

    /**
     * File identifier of the sticker
     */
    private final String sticker;

    /**
     * A JSON-serialized list of 0-20 search keywords for the sticker with total length of up to 64 characters
     */
    private List<String> keywords;

}
