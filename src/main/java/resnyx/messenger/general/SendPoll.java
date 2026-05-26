package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.ParseMode;
import resnyx.common.SendOptions;
import resnyx.messenger.inputmedia.InputPollMedia;
import resnyx.util.UnixTimeSerializer;
import tools.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Use this method to send a native poll. On success, the sent Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendPoll implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which the message will be sent
     */
    @JsonProperty("business_connection_id")
    private String businessConnectionId;

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Unique identifier for the target message thread (topic) of a forum;
     * for forum supergroups and private chats of bots with forum topic mode enabled only
     */
    @JsonProperty("message_thread_id")
    private Long messageThreadId;

    /**
     * Poll question, 1-300 characters
     */
    private final String question;

    /**
     * Mode for parsing entities in the question.
     * See formatting options for more details.
     * Currently, only custom emoji entities are allowed
     */
    @JsonProperty("question_parse_mode")
    private final ParseMode questionParseMode;

    /**
     * A JSON-serialized list of special entities that appear in the poll question.
     * It can be specified instead of question_parse_mode
     */
    @JsonProperty("question_entities")
    private final List<MessageEntity> questionEntities;

    /**
     * A JSON-serialized list of answer options, 2-10 strings 1-100 characters each
     */
    private final List<InputPollOption> options;

    /**
     * True, if the poll needs to be anonymous, defaults to True
     */
    @JsonProperty("is_anonymous")
    private Boolean isAnonymous;

    /**
     * Poll type, “quiz” or “regular”, defaults to “regular”
     */
    private PollType type;

    /**
     * True, if the poll allows multiple answers, ignored for polls in quiz mode, defaults to False
     */
    @JsonProperty("allows_multiple_answers")
    private Boolean allowsMultipleAnswers;

    /**
     * Pass True, if the poll allows to change chosen answer options,
     * defaults to False for quizzes and to True for regular polls
     */
    @JsonProperty("allows_revoting")
    private Boolean allowsRevoting;

    /**
     * Pass True, if the poll options must be shown in random order
     */
    @JsonProperty("shuffle_options")
    private Boolean shuffleOptions;

    /**
     * Pass True, if answer options can be added to the poll after creation;
     * not supported for anonymous polls and quizzes
     */
    @JsonProperty("allow_adding_options")
    private Boolean allowAddingOptions;

    /**
     * Pass True, if poll results must be shown only after the poll closes
     */
    @JsonProperty("hide_results_until_closes")
    private Boolean hideResultsUntilCloses;

    /**
     * Pass True, if voting is limited to users who have been members of the chat
     * where the poll is being sent for more than 24 hours; for channel chats only
     */
    @JsonProperty("members_only")
    private Boolean membersOnly;

    /**
     * A JSON-serialized list of 0-12 two-letter <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>
     * country codes indicating the countries from which users can vote in the poll; for channel chats only.
     * Use “FT” as a country code to allow users with anonymous numbers to vote.
     * If omitted or empty, then users from any country can participate in the poll.
     */
    @JsonProperty("country_codes")
    private List<String> countryCodes;

    /**
     * A JSON-serialized list of monotonically increasing 0-based identifiers of the correct answer options,
     * required for polls in quiz mode
     */
    @JsonProperty("correct_option_ids")
    private List<Integer> correctOptionIds;

    /**
     * Text that is shown when a user chooses an incorrect answer or taps on the lamp icon in a quiz-style poll,
     * 0-200 characters with at most 2 line feeds after entities parsing
     */
    private String explanation;

    /**
     * Mode for parsing entities in the explanation.
     */
    @JsonProperty("explanation_parse_mode")
    private ParseMode explanationParseMode;

    /**
     * A JSON-serialized list of special entities that appear in the poll explanation, which can be specified instead of parse_mode
     */
    @JsonProperty("explanation_entities")
    private List<MessageEntity> explanationEntities;

    /**
     * Media added to the quiz explanation
     */
    @JsonProperty("explanation_media")
    private InputPollMedia explanationMedia;

    /**
     * Amount of time in seconds the poll will be active after creation, 5-600. Can't be used together with close_date.
     */
    @JsonProperty("open_period")
    private Integer openPeriod;

    /**
     * Point in time (Unix timestamp) when the poll will be automatically closed.
     * Must be at least 5 and no more than 600 seconds in the future.
     * Can't be used together with open_period.
     */
    @JsonSerialize(using = UnixTimeSerializer.class)
    @JsonProperty("close_date")
    private LocalDateTime closeDate;

    /**
     * Pass True if the poll needs to be immediately closed. This can be useful for poll preview.
     */
    @JsonProperty("is_closed")
    private Boolean isClosed;

    /**
     * Description of the poll to be sent, 0-1024 characters after entities parsing
     */
    private String description;

    /**
     * Mode for parsing entities in the poll description. See formatting options for more details.
     */
    @JsonProperty("description_parse_mode")
    private ParseMode descriptionParseMode;

    /**
     * A JSON-serialized list of special entities that appear in the poll description,
     * which can be specified instead of description_parse_mode
     */
    @JsonProperty("description_entities")
    private List<MessageEntity> descriptionEntities;

    /**
     * Media added to the poll description
     */
    @JsonProperty("media")
    private InputPollMedia media;

    @JsonUnwrapped
    private SendOptions sendOptions;

}
