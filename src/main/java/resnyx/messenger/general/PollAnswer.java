package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public final class PollAnswer {

    /**
     * Unique poll identifier
     */
    @JsonProperty("poll_id")
    private String pollId;

    /**
     * Optional. The chat that changed the answer to the poll, if the voter is anonymous
     */
    @JsonProperty("voter_chat")
    private Chat voterChat;

    /**
     * Optional. The user that changed the answer to the poll, if the voter isn't anonymous
     */
    private User user;

    /**
     * 0-based identifiers of chosen answer options. May be empty if the vote was retracted.
     */
    @JsonProperty("option_ids")
    private List<Integer> optionIds;
}
