package resnyx.messenger.inputmedia;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.ParseMode;
import resnyx.messenger.general.MessageEntity;

import java.util.List;

/**
 * Represents a live photo to be sent.
 */
@Data
@NoArgsConstructor
public final class InputMediaLivePhoto implements InputMedia, InputPollMedia, InputPollOptionMedia {

    /**
     * Type of the result, must be live_photo
     */
    private String type;

    /**
     * Video of the live photo to send.
     * Pass a file_id to send a file that exists on the Telegram servers (recommended)
     * or pass “attach://&lt;file_attach_name&gt;”
     * to upload a new one using multipart/form-data under &lt;file_attach_name&gt; name.
     * Sending live photos by a URL is currently unsupported.
     */
    private String media;

    /**
     * The static photo to send.
     * Pass a file_id to send a file that exists on the Telegram servers (recommended)
     * or pass “attach://&lt;file_attach_name&gt;”
     * to upload a new one using multipart/form-data under &lt;file_attach_name&gt; name.
     * Sending live photos by a URL is currently unsupported.
     */
    private String photo;

    /**
     * Optional. Caption of the live photo to be sent, 0-1024 characters after entities parsing
     */
    private String caption;

    /**
     * Optional. Mode for parsing entities in the live photo caption.
     */
    @JsonProperty("parse_mode")
    private ParseMode parseMode;

    /**
     * Optional. List of special entities that appear in the caption, which can be specified instead of parse_mode
     */
    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities;

    /**
     * Optional. Pass True, if the caption must be shown above the message media
     */
    @JsonProperty("show_caption_above_media")
    private Boolean showCaptionAboveMedia;

    /**
     * Optional. Pass True if the live photo needs to be covered with a spoiler animation
     */
    @JsonProperty("has_spoiler")
    private Boolean hasSpoiler;
}
