package resnyx.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import resnyx.messenger.general.MessageEntity;

import java.util.List;

@Data
public final class Caption {

    /**
     * Optional. Caption of the object to be sent, 0-1024 characters after entities parsing
     */
    @JsonProperty("caption")
    private final String name;

    /**
     * Optional. Mode for parsing entities in the object caption. See formatting options for more details.
     */
    @JsonProperty("parse_mode")
    private ParseMode parseMode;

    /**
     * Optional. List of special entities that appear in the caption, which can be specified instead of parse_mode
     */
    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities;

    /**
     * Optional. True, if the caption must be shown above the message media
     */
    @JsonProperty("show_caption_above_media")
    private Boolean showCaptionAboveMedia;
}
