package resnyx.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.FileAttr;
import resnyx.messenger.general.PhotoSize;

/**
 * This object represents a sticker.
 */
@Data
@NoArgsConstructor
public final class Sticker {

    @JsonUnwrapped
    private FileAttr fileAttr;

    /**
     * Type of the sticker, currently one of “regular”, “mask”, “custom_emoji”.
     * The type of the sticker is independent from its format, which is determined by the fields is_animated and is_video.
     */
    private StickerType type;

    /**
     * Sticker width
     */
    private Integer width;

    /**
     * Sticker height
     */
    private Integer height;

    /**
     * True, if the sticker is animated
     */
    @JsonProperty("is_animated")
    private Boolean isAnimated;

    /**
     * True, if the sticker is a video sticker
     */
    @JsonProperty("is_video")
    private Boolean isVideo;

    /**
     * Optional. Sticker thumbnail in the .WEBP or .JPG format
     */
    private PhotoSize thumbnail;

    /**
     * Optional. Emoji associated with the sticker
     */
    private String emoji;

    /**
     * Optional. Name of the sticker set to which the sticker belongs
     */
    private String setName;

    /**
     * Optional. For premium regular stickers, premium animation for the sticker
     */
    private File premiumAnimation;

    /**
     * Optional. For mask stickers, the position where the mask should be placed
     */
    @JsonProperty("mask_position")
    private MaskPosition maskPosition;

    /**
     * Optional. For custom emoji stickers, unique identifier of the custom emoji
     */
    @JsonProperty("custom_emoji_id")
    private String customEmojiId;

    /**
     * Optional. True, if the sticker must be repainted to a text color in messages,
     * the color of the Telegram Premium badge in emoji status, white color on chat photos,
     * or another appropriate color in other places
     */
    @JsonProperty("needs_repainting")
    private Boolean needsRepainting;

}
