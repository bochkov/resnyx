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
 * Use this method to edit captions of messages.
 * On success the edited Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class EditMessageCaption implements TgMethod {

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
