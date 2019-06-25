package resnyx.methods.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.TgMethod;
import resnyx.Types;
import resnyx.model.InputFile;
import resnyx.model.MaskPosition;

/**
 * Use this method to add a new sticker to a set created by the bot. Returns True on success.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class AddStickerToSet extends TgMethod<Boolean> {

    public static final String METHOD = "addStickerToSet";

    /**
     * User identifier of sticker set owner
     */
    @JsonProperty("user_id")
    private Long userId;

    /**
     * Sticker set name
     */
    private String name;

    /**
     * Png image with the sticker, must be up to 512 kilobytes in size,
     * dimensions must not exceed 512px, and either width or height must be exactly 512px.
     * Pass a file_id as a String to send a file that already exists on the Telegram servers,
     * pass an HTTP URL as a String for Telegram to get a file from the Internet,
     * or upload a new one using multipart/form-data.
     */
    @JsonProperty("png_sticker")
    private InputFile sticker;

    /**
     * One or more emoji corresponding to the sticker
     */
    private String emoji;

    /**
     * One or more emoji corresponding to the sticker
     */
    @JsonProperty("mask_position")
    private MaskPosition maskPosition;

    public AddStickerToSet(String token, Long userId, String name, InputFile sticker, String emoji) {
        super(token);
        this.userId = userId;
        this.name = name;
        this.sticker = sticker;
        this.emoji = emoji;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference type() {
        return Types.BOOL;
    }
}
