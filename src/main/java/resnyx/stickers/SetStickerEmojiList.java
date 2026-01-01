package resnyx.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

import java.util.List;

/**
 * Use this method to change the list of emoji assigned to a regular or custom emoji sticker.
 * The sticker must belong to a sticker set created by the bot. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetStickerEmojiList implements TgMethod {

    /**
     * File identifier of the sticker
     */
    private final String sticker;

    /**
     * A JSON-serialized list of 1-20 emoji associated with the sticker
     */
    @JsonProperty("emoji_list")
    private final List<String> emojiList;

}
