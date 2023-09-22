package resnyx.stickers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to create a new sticker set owned by a user.
 * The bot will be able to edit the sticker set thus created. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class CreateNewStickerSet implements TgMethod {

    /**
     * User identifier of created sticker set owner
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * Short name of sticker set, to be used in t.me/addstickers/ URLs (e.g., animals).
     * Can contain only English letters, digits and underscores.
     * Must begin with a letter, can't contain consecutive underscores and
     * must end in "_by_&lt;bot_username&gt;". &lt;bot_username&gt; is case insensitive. 1-64 characters.
     */
    private final String name;

    /**
     * Sticker set title, 1-64 characters
     */
    private final String title;

    /**
     * A JSON-serialized list of 1-50 initial stickers to be added to the sticker set
     */
    private final List<InputSticker> stickers;

    /**
     * Format of stickers in the set, must be one of “static”, “animated”, “video”
     */
    @JsonProperty("sticker_format")
    private final StickerFormat stickerFormat;

    /**
     * Type of stickers in the set, pass “regular”, “mask”, or “custom_emoji”.
     * By default, a regular sticker set is created.
     */
    @JsonProperty("sticker_type")
    private StickerType stickerType;

    /**
     * Pass True if stickers in the sticker set must be repainted to the color of text when used in messages,
     * the accent color if used as emoji status, white on chat photos, or another appropriate color based on context;
     * for custom emoji sticker sets only
     */
    @JsonProperty("needs_repainting")
    private Boolean needsRepainting;

}
