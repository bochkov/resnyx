package resnyx.methods.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.Answer;
import resnyx.TgMethod;
import resnyx.Types;
import resnyx.model.File;
import resnyx.model.InputFile;

/**
 * Use this method to upload a .png file with a sticker for
 * later use in createNewStickerSet and addStickerToSet methods (can be used multiple times).
 * Returns the uploaded File on success.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class UploadStickerFile extends TgMethod<File> {

    public static final String METHOD = "uploadStickerFile";

    /**
     * User identifier of sticker file owner
     */
    @JsonProperty("user_id")
    private Long userId;

    /**
     * <b>Png</b> image with the sticker, must be up to 512 kilobytes in size,
     * dimensions must not exceed 512px, and either width or height must be exactly 512px.
     */
    @JsonProperty("png_sticker")
    private InputFile sticker;

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference<Answer<File>> type() {
        return Types.FILE;
    }
}
