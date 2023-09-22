package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to set the result of an interaction with a Web App and send a corresponding message
 * on behalf of the user to the chat from which the query originated.
 * On success, a SentWebAppMessage object is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class AnswerWebAppQuery implements TgMethod {

    /**
     * Unique identifier for the query to be answered
     */
    @JsonProperty("web_app_query_id")
    private final String webAppQueryId;

    /**
     * A JSON-serialized object describing the message to be sent
     */
    private final InlineQueryResult result;
}
