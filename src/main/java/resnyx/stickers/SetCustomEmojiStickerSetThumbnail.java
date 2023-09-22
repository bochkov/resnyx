package resnyx.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to set the thumbnail of a custom emoji sticker set. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetCustomEmojiStickerSetThumbnail implements TgMethod {

    /**
     * Sticker set name
     */
    private final String name;

    /**
     * Custom emoji identifier of a sticker from the sticker set;
     * pass an empty string to drop the thumbnail and use the first sticker as the thumbnail.
     */
    @JsonProperty("custom_emoji_id")
    private String customEmojiId;

}
