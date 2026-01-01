package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

import java.util.List;

/**
 * Use this method to send answers to an inline query. On success, True is returned.
 * No more than 50 results per query are allowed.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class AnswerInlineQuery implements TgMethod {

    /**
     * Unique identifier for the answered query
     */
    @JsonProperty("inline_query_id")
    private final String inlineQueryId;

    /**
     * A JSON-serialized array of results for the inline query
     */
    private final List<InlineQueryResult> results;

    /**
     * The maximum amount of time in seconds that the result of the inline query may be cached on the server.
     * Defaults to 300.
     */
    @JsonProperty("cache_time")
    private Integer cacheTime;

    /**
     * Pass True if results may be cached on the server side only for the user that sent the query.
     * By default, results may be returned to any user who sends the same query.
     */
    @JsonProperty("is_personal")
    private Boolean isPersonal;

    /**
     * Pass the offset that a client should send in the next query with the same text to receive more results.
     * Pass an empty string if there are no more results or if you don't support pagination.
     * Offset length can't exceed 64 bytes.
     */
    @JsonProperty("next_offset")
    private Boolean nextOffset;

    /**
     * A JSON-serialized object describing a button to be shown above inline query results
     */
    private InlineQueryResultsButton button;
}
