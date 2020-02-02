package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * This object represents an answer of a user in a non-anonymous poll.
 */
@Data
public final class PollAnswer {

    /**
     * Unique poll identifier
     */
    @JsonProperty("poll_id")
    private String id;

    /**
     * The user, who changed the answer to the poll
     */
    private User user;

    /**
     * 0-based identifiers of answer options, chosen by the user. May be empty if the user retracted their vote.
     */
    @JsonProperty("option_ids")
    private List<Integer> options;
}
