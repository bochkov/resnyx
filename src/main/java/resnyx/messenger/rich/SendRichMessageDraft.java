package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to stream a partial rich message to a user while the message is being generated.
 * Note that the streamed draft is ephemeral and acts as a temporary 30-second preview - once the output is finalized,
 * you must call sendRichMessage with the complete message to persist it in the user's chat.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendRichMessageDraft implements TgMethod {

    /**
     * Unique identifier for the target private chat
     */
    @JsonProperty("chat_id")
    private final Long chatId;

    /**
     * Unique identifier for the target message thread
     */
    @JsonProperty("message_thread_id")
    private Long messageThreadId;

    /**
     * Unique identifier of the message draft; must be non-zero.
     * Changes to drafts with the same identifier are animated.
     */
    @JsonProperty("draft_id")
    private final Integer draftId;

    /**
     * The partial message to be streamed. Direct upload of new files isn't supported.
     */
    @JsonProperty("rich_message")
    private final InputRichMessage richMessage;
}
