package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.inline.InlineQueryResult;

/**
 * Use this method to reply to a received guest message.
 * On success, a SentGuestMessage object is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class AnswerGuestQuery implements TgMethod {

    /**
     * Unique identifier for the query to be answered
     */
    @JsonProperty("guest_query_id")
    private final String guestQueryId;

    /**
     * A JSON-serialized object describing the message to be sent
     */
    @JsonProperty("result")
    private InlineQueryResult result;
}
