package resnyx.messenger.general;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.ParseMode;
import resnyx.common.SendOptions;

/**
 * Use this method to send text messages. On success, the sent {@link Message} is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendMessage implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which the message will be sent
     */
    @JsonProperty("business_connection_id")
    private String businessConnectionId;

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Text of the message to be sent, 1-4096 characters after entities parsing
     */
    private final String text;

    /**
     * Mode for parsing entities in the message text. See formatting options for more details.
     */
    @JsonProperty("parse_mode")
    private ParseMode parseMode;

    /**
     * A JSON-serialized list of special entities that appear in message text, which can be specified instead of parse_mode
     */
    private List<MessageEntity> entities;

    /**
     * Link preview generation options for the message
     */
    @JsonProperty("link_preview_options")
    private LinkPreviewOptions linkPreviewOptions;

    @JsonUnwrapped
    private SendOptions sendOptions;

}
