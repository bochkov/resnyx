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
 * Use this method to create new sticker set owned by a user.
 * The bot will be able to edit the created sticker set. Returns True on success.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class CreateNewStickerSet extends TgMethod<Boolean> {

    public static final String METHOD = "createNewStickerSet";

    /**
     * User identifier of created sticker set owner
     */
    @JsonProperty("user_id")
    private Long userId;

    /**
     * Short name of sticker set, to be used in t.me/addstickers/ URLs (e.g., animals).
     * Can contain only english letters, digits and underscores.
     * Must begin with a letter, can't contain consecutive underscores and must end in “_by_<bot username>”.
     * <bot_username> is case insensitive. 1-64 characters.
     */
    private String name;

    /**
     * Sticker set title, 1-64 characters
     */
    private String title;

    /**
     * Png image with the sticker, must be up to 512 kilobytes in size,
     * dimensions must not exceed 512px, and either width or height must be exactly 512px.
     * Pass a file_id as a String to send a file that already exists on the Telegram servers,
     * pass an HTTP URL as a String for Telegram to get a file from the Internet,
     * or upload a new one using multipart/form-data
     */
    @JsonProperty("png_sticker")
    private InputFile sticker;

    /**
     * One or more emoji corresponding to the sticker
     */
    private String emoji;

    /**
     * Optional. Pass True, if a set of mask stickers should be created
     */
    @JsonProperty("contains_masks")
    private Boolean containsMasks;

    /**
     * Optional. A JSON-serialized object for position where the mask should be placed on faces
     */
    @JsonProperty("mask_position")
    private MaskPosition maskPosition;

    public CreateNewStickerSet(String token, Long userId, String name,
                               String title, InputFile sticker, String emoji) {
        super(token);
        this.userId = userId;
        this.name = name;
        this.title = title;
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
