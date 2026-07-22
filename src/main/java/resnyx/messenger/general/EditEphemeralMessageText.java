package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.ParseMode;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

import java.util.List;

/**
 * Use this method to edit an ephemeral text message.
 * Note that it is not guaranteed that the user will receive the message edit event, especially if they are offline.
 * On success, True is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class EditEphemeralMessageText implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target supergroup in the format @username
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Identifier of the user who received the message
     */
    @JsonProperty("receiver_user_id")
    private final Long receiverUserId;

    /**
     * Identifier of the ephemeral message to edit
     */
    @JsonProperty("ephemeral_message_id")
    private final Long ephemeralMessageId;

    /**
     * New text of the message, 1-4096 characters after entity parsing
     */
    private final String text;

    /**
     * Mode for parsing entities in the message text. See formatting options for more details.
     */
    @JsonProperty("parse_mode")
    private ParseMode parseMode;

    /**
     * A JSON-serialized list of special entities that appear in message text,
     * which can be specified instead of parse_mode
     */
    private List<MessageEntity> entities;

    /**
     * Link preview generation options for the message
     */
    @JsonProperty("link_preview_options")
    private LinkPreviewOptions linkPreviewOptions;

    /**
     * A JSON-serialized object for an inline keyboard
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;
}
