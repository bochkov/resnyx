package resnyx.inline;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.TgMethodName;
import resnyx.common.ParseMode;
import resnyx.messenger.general.MessageEntity;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Use this method to edit captions of messages.
 * On success True is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
@TgMethodName("editMessageCaption")
public final class EditInlineMessageCaption implements TgMethod {

    /**
     * Identifier of the inline message
     */
    @JsonProperty("inline_message_id")
    private final String inlineMessageId;

    /**
     * New caption of the message, 0-1024 characters after entities parsing
     */
    private final String caption;

    /**
     * Mode for parsing entities in the message caption
     */
    @JsonProperty("parse_mode")
    private ParseMode parseMode;

    /**
     * A JSON-serialized list of special entities that appear in the caption, which can be specified instead of parse_mode
     */
    private List<MessageEntity> entities;

    /**
     * A JSON-serialized object for an inline keyboard
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;
}
