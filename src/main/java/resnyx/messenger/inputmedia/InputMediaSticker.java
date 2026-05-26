package resnyx.messenger.inputmedia;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a sticker file to be sent.
 */
@Data
@NoArgsConstructor
public final class InputMediaSticker implements InputMedia, InputPollOptionMedia {

    /**
     * Type of the result, must be sticker
     */
    @JsonProperty("type")
    private String type;

    /**
     * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL for Telegram to get a .WEBP sticker from the Internet,
     * or pass “attach://&lt;file_attach_name&gt;” to upload a new .WEBP, .TGS, or .WEBM sticker
     * using multipart/form-data under &lt;file_attach_name&gt; name.
     */
    @JsonProperty("media")
    private String media;

    /**
     * Optional. Emoji associated with the sticker; only for just uploaded stickers
     */
    @JsonProperty("emoji")
    private String emoji;
}
