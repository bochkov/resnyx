package resnyx.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import resnyx.messenger.general.MessageEntity;

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
}
