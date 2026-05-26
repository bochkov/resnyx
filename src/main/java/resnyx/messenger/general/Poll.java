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
     * True, if the poll allows to change the chosen answer options
     */
    @JsonProperty("allows_revoting")
    private Boolean allowsRevoting;

    /**
     * True if voting is limited to users who have been members of the chat
     * where the poll was originally sent for more than 24 hours
     */
    @JsonProperty("members_only")
    private Boolean membersOnly;

    /**
     * Optional. A list of two-letter <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>
     * country codes indicating the countries from which users can vote in the poll.
     * The country code “FT” is used for users with anonymous numbers.
     * If omitted, then users from any country can participate in the poll.
     */
    @JsonProperty("country_codes")
    private List<String> countryCodes;

    /**
     * Optional. Array of 0-based identifiers of the correct answer options.
     * Available only for polls in quiz mode which are closed or were sent (not forwarded)
     * by the bot or to the private chat with the bot.
     */
    @JsonProperty("correct_option_ids")
    private List<Integer> correctOptionIds;

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
     * Optional. Media added to the quiz explanation
     */
    @JsonProperty("explanation_media")
    private PollMedia explanationMedia;

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

    /**
     * Optional. Description of the poll; for polls inside the Message object only
     */
    private String description;

    /**
     * Optional. Special entities like usernames, URLs, bot commands, etc. that appear in the description
     */
    @JsonProperty("description_entities")
    private List<MessageEntity> descriptionEntities;

    /**
     * Optional. Media added to the poll description; for polls inside the Message object only
     */
    private PollMedia media;
}
