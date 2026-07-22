package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to process a received chat join request query.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class AnswerChatJoinRequestQuery implements TgMethod {

    /**
     * Unique identifier of the join request query
     */
    @JsonProperty("chat_join_request_query_id")
    private final String chatJoinRequestQueryId;

    /**
     * Result of the query.
     * Must be either “approve” to allow the user to join the chat,
     * “decline” to disallow the user to join the chat,
     * or “queue” to leave the decision to other administrators.
     */
    private final String result;
}
