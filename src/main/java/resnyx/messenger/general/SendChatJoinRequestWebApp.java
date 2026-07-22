package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to process a received chat join request query by
 * showing a Mini App to the user before deciding the outcome.
 * Call answerChatJoinRequestQuery to resolve the join request query based
 * on the user interaction with the Mini App.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendChatJoinRequestWebApp implements TgMethod {

    /**
     * Unique identifier of the join request query
     */
    @JsonProperty("chat_join_request_query_id")
    private final String chatJoinRequestQueryId;

    /**
     * An HTTPS URL of a Web App to be opened with additional data as specified in Initializing Web Apps
     */
    @JsonProperty("web_app_url")
    private final String webAppUrl;
}
