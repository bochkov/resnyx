package resnyx.model;

import lombok.Data;

/**
 * This object contains information about one answer option in a poll.
 */
@Data
public final class PollOption {

    /**
     * Option text, 1-100 characters
     */
    private String text;

    /**
     * Number of users that voted for this option
     */
    private Integer voterCount;
}
