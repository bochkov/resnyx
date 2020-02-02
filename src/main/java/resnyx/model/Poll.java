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

    /**
     * True, if the poll is anonymous
     */
    @JsonProperty("is_anonymous")
    private Boolean isAnonymous;

    /**
     * Poll type, currently can be “regular” or “quiz”
     */
    private PollType type;

    /**
     * True, if the poll allows multiple answers
     */
    @JsonProperty("allows_multiple_answers")
    private Boolean allowMulti;

    /**
     * Optional. 0-based identifier of the correct answer option.
     * Available only for polls in the quiz mode, which are closed,
     * or was sent (not forwarded) by the bot or to the private chat with the bot.
     */
    @JsonProperty("correct_option_id")
    private Integer correctOption;

    public enum PollType {

        QUIZ("quiz"),
        REGULAR("regular");

        String ac;

        PollType(String ac) {
            this.ac = ac;
        }

    }
}
