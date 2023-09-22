package resnyx.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.InputFile;

/**
 * Use this method to upload a file with a sticker for later use in the
 * createNewStickerSet and addStickerToSet methods (the file can be used multiple times).
 * Returns the uploaded File on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class UploadStickerFile implements TgMethod {

    /**
     * User identifier of sticker file owner
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * A file with the sticker in .WEBP, .PNG, .TGS, or .WEBM format.
     * See <a href="https://core.telegram.org/stickers">https://core.telegram.org/stickers</a> for technical requirements
     */
    private final InputFile sticker;

    /**
     * Format of the sticker, must be one of “static”, “animated”, “video”
     */
    @JsonProperty("sticker_format")
    private StickerFormat stickerFormat;

}
