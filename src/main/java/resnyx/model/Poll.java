package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * This object contains information about a poll.
 */
@Data
public final class Poll {

    /**
     * Unique poll identifier
     */
    private String id;

    /**
     * Poll question, 1-255 characters
     */
    private String question;

    /**
     * List of poll options
     */
    private List<PollOption> options;

    /**
     * True, if the poll is closed
     */
    @JsonProperty("is_closed")
    private Boolean isClosed;
}
