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
 * Use this method to edit the caption of an ephemeral message.
 * Note that it is not guaranteed that the user will receive the message edit event, especially if they are offline.
 * On success, True is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class EditEphemeralMessageCaption implements TgMethod {

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
     * New caption of the message, 0-1024 characters after entities parsing
     */
    private String caption;

    /**
     * Mode for parsing entities in the message caption. See formatting options for more details.
     */
    @JsonProperty("parse_mode")
    private ParseMode parseMode;

    /**
     * A JSON-serialized list of special entities that appear in the caption, which can be specified instead of parse_mode
     */
    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities;

    /**
     * A JSON-serialized object for an inline keyboard
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;
}
