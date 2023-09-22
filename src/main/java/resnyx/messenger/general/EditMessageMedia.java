package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.InputFile;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Use this method to edit animation, audio, document, photo, or video messages.
 * If a message is part of a message album, then it can be edited only to an audio for audio albums,
 * only to a document for document albums and to a photo or a video otherwise.
 * When an inline message is edited, a new file can't be uploaded; use a previously uploaded file via its file_id or specify a URL.
 * On success the edited Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class EditMessageMedia implements TgMethod {

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
     * A JSON-serialized object for a new media content of the message
     */
    private final InputFile media;

    /**
     * A JSON-serialized object for a new inline keyboard
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

}
