package resnyx.messenger.general;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.ParseMode;
import resnyx.common.SendOptions;
import resnyx.util.UnixTimeSerializer;

/**
 * Use this method to send a native poll. On success, the sent Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendPoll implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Poll question, 1-300 characters
     */
    private final String question;

    /**
     * A JSON-serialized list of answer options, 2-10 strings 1-100 characters each
     */
    private final List<String> options;

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
    @JsonProperty("allow_multiple_answers")
    private Boolean allowMultipleAnswers;

    /**
     * 0-based identifier of the correct answer option, required for polls in quiz mode
     */
    @JsonProperty("correct_option_id")
    private Integer correctOptionId;

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

    @JsonUnwrapped
    private SendOptions sendOptions;

}
