package resnyx.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.InputFile;

/**
 * Use this method to set the thumbnail of a regular or mask sticker set.
 * The format of the thumbnail file must match the format of the stickers in the set.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetStickerSetThumbnail implements TgMethod {

    /**
     * Sticker set name
     */
    private final String name;

    /**
     * User identifier of the sticker set owner
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * A .WEBP or .PNG image with the thumbnail, must be up to 128 kilobytes in size and have a width and height of exactly 100px,
     * or a .TGS animation with a thumbnail up to 32 kilobytes in size,
     * or a WEBM video with the thumbnail up to 32 kilobytes in size.
     * Pass a file_id as a String to send a file that already exists on the Telegram servers,
     * pass an HTTP URL as a String for Telegram to get a file from the Internet,
     * or upload a new one using multipart/form-data.
     * Animated and video sticker set thumbnails can't be uploaded via HTTP URL.
     * If omitted, then the thumbnail is dropped and the first sticker is used as the thumbnail.
     */
    private InputFile thumbnail;

}
