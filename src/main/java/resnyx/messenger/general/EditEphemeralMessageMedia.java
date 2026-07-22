package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.messenger.inputmedia.InputMedia;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Use this method to edit the media of an ephemeral message.
 * Note that it is not guaranteed that the user will receive the message edit event, especially if they are offline.
 * On success, True is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class EditEphemeralMessageMedia implements TgMethod {

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
     * A JSON-serialized object for the new media content of the message.
     * A new file can't be uploaded; use a previously uploaded file via its file_id or specify a URL.
     */
    private final InputMedia media;

    /**
     * A JSON-serialized object for an inline keyboard
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;
}
