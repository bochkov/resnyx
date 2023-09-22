package resnyx.stickers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.InputFile;

/**
 * This object describes a sticker to be added to a sticker set.
 */
@Data
@NoArgsConstructor
public final class InputSticker {

    /**
     * The added sticker. Pass a file_id as a String to send a file that already exists on the Telegram servers,
     * pass an HTTP URL as a String for Telegram to get a file from the Internet, upload a new one using multipart/form-data,
     * or pass “attach://&lt;file_attach_name&gt;” to upload a new one using multipart/form-data under &lt;file_attach_name&gt; name.
     * Animated and video stickers can't be uploaded via HTTP URL.
     */
    private InputFile sticker;

    /**
     * List of 1-20 emoji associated with the sticker
     */
    @JsonProperty("emoji_list")
    private List<String> emojiList;

    /**
     * Optional. Position where the mask should be placed on faces. For “mask” stickers only.
     */
    @JsonProperty("mask_position")
    private MaskPosition maskPosition;

    /**
     * Optional. List of 0-20 search keywords for the sticker with total length of up to 64 characters. For “regular” and “custom_emoji” stickers only.
     */
    private List<String> keyword;
}
