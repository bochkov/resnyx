package resnyx.messenger.general;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.ParseMode;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Use this method to edit text and game messages.
 * On success the edited Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class EditMessageText implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Identifier of the message to edit
     */
    @JsonProperty("message_id")
    private final Long messageId;

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
     * A JSON-serialized object for an inline keyboard
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;
}
