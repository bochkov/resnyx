package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.TgMethodName;
import resnyx.common.ParseMode;
import resnyx.messenger.general.MessageEntity;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

import java.util.List;

/**
 * Use this method to edit text and game messages.
 * On success True is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
@TgMethodName("editMessageText")
public final class EditInlineMessageText implements TgMethod {

    /**
     * Identifier of the inline message
     */
    @JsonProperty("inline_message_id")
    private final String inlineMessageId;

    /**
     * New text of the message, 1-4096 characters after entities parsing
     */
    private final String text;

    /**
     * Mode for parsing entities in the message text.
     */
    @JsonProperty("parse_mode")
    private ParseMode parseMode;

    /**
     * A JSON-serialized list of special entities that appear in message text, which can be specified instead of parse_mode
     */
    private List<MessageEntity> entities;

    /**
     * Disables link previews for links in this message
     */
    @JsonProperty("disable_web_page_preview")
    private Boolean disableWebPagePreview;

    /**
     * A JSON-serialized object for an inline keyboard.
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;
}
