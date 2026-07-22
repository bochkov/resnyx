package resnyx.messenger.inputmedia;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.ParseMode;
import resnyx.messenger.general.MessageEntity;

import java.util.List;

/**
 * Represents a voice message file to be sent.
 */
@Data
@NoArgsConstructor
public final class InputMediaVoiceNote implements InputMedia {

    /**
     * Type of the media, must be voice_note
     */
    private String type;

    /**
     * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL for Telegram to get a file from the Internet,
     * or pass "attach://&lt;file_attach_name&gt;" to upload a new one
     * using multipart/form-data under &lt;file_attach_name&gt; name.
     */
    private String media;

    /**
     * Optional. Caption of the voice message to be sent, 0-1024 characters after entities parsing
     */
    private String caption;

    /**
     * Optional. Mode for parsing entities in the voice message caption. See formatting options for more details.
     */
    @JsonProperty("parse_mode")
    private ParseMode parseMode;

    /**
     * Optional. List of special entities that appear in the caption, which can be specified instead of parse_mode
     */
    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities;

    /**
     * Optional. Duration of the voice message in seconds
     */
    private Integer duration;
}
