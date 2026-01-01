package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.ParseMode;

import java.util.List;

/**
 * Use this method to stream a partial message to a user while the message is being generated;
 * supported only for bots with forum topic mode enabled.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendMessageDraft implements TgMethod {

    /**
     * Unique identifier for the target private chat
     */
    private final Long chatId;

    /**
     * Unique identifier for the target message thread
     */
    @JsonProperty("message_thread_id")
    private Long messageThreadId;

    /**
     * Unique identifier of the message draft; must be non-zero.
     * Changes of drafts with the same identifier are animated
     */
    @JsonProperty("draft_id")
    private Integer draftId;

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
     * A JSON-serialized list of special entities that appear in message text,
     * which can be specified instead of parse_mode
     */
    private List<MessageEntity> entities;

}
