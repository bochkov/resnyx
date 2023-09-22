package resnyx.inline;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.ParseMode;
import resnyx.messenger.general.MessageEntity;

/**
 * Represents the content of a text message to be sent as the result of an inline query.
 */
@Data
@NoArgsConstructor
public final class InputTextMessageContent implements InputMessageContent {

    /**
     * Text of the message to be sent, 1-4096 characters
     */
    @JsonProperty("message_text")
    private String messageText;

    /**
     * Optional. Mode for parsing entities in the message text.
     */
    @JsonProperty("parse_mode")
    private ParseMode parseMode;

    /**
     * Optional. List of special entities that appear in message text, which can be specified instead of parse_mode
     */
    private List<MessageEntity> entities;

    /**
     * Optional. Disables link previews for links in the sent message
     */
    @JsonProperty("disable_web_page_preview")
    private Boolean disableWebPagePreview;
}
