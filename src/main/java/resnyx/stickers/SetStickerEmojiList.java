package resnyx.stickers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

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
