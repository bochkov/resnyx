package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.List;

/**
 * This object contains information about a poll.
 */
@Data
@NoArgsConstructor
public final class Poll {

    /**
     * Unique poll identifier
     */
    private String id;

    /**
     * Poll question, 1-300 characters
     */
    private String question;

    /**
     * Optional. Special entities that appear in the question.
     * Currently, only custom emoji entities are allowed in poll questions
     */
    @JsonProperty("question_entities")
    private List<MessageEntity> questionEntities;

    /**
     * List of poll options
     */
    private List<PollOption> options;

    /**
     * Total number of users that voted in the poll
     */
    @JsonProperty("total_voter_count")
    private Integer totalVoterCount;

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
     * Poll type
     */
    @JsonProperty("poll_type")
    private PollType pollType;

    /**
     * True, if the poll allows multiple answers
     */
    @JsonProperty("allows_multiple_answers")
    private Boolean allowsMultipleAnswers;

    /**
     * Optional. 0-based identifier of the correct answer option.
     * Available only for polls in the quiz mode, which are closed, or was sent (not forwarded) by the bot or to the private chat with the bot.
     */
    @JsonProperty("correct_option_id")
    private Integer correctOptionId;

    /**
     * Optional. Text that is shown when a user chooses an incorrect answer or taps on the lamp icon in a quiz-style poll, 0-200 characters
     */
    private String explanation;

    /**
     * Optional. Special entities like usernames, URLs, bot commands, etc. that appear in the explanation
     */
    @JsonProperty("explanation_entities")
    private List<MessageEntity> explanationEntities;

    /**
     * Optional. Amount of time in seconds the poll will be active after creation
     */
    @JsonProperty("open_period")
    private Integer openPeriod;

    /**
     * Optional. Point in time (Unix timestamp) when the poll will be automatically closed
     */
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    @JsonProperty("close_date")
    private LocalDateTime closeDate;
}
