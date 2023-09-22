package resnyx.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to change the mask position of a mask sticker.
 * The sticker must belong to a sticker set that was created by the bot. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetStickerMaskPosition implements TgMethod {

    /**
     * File identifier of the sticker
     */
    private final String sticker;

    /**
     * A JSON-serialized object with the position where the mask should be placed on faces.
     * Omit the parameter to remove the mask position.
     */
    @JsonProperty("mask_position")
    private MaskPosition maskPosition;

}
