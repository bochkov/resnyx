package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.ParseMode;

import java.util.List;

/**
 * Describes reply parameters for the message that is being sent.
 */
@Data
@NoArgsConstructor
public final class ReplyParameters {

    /**
     * Optional. Identifier of the message that will be replied to in the current chat,
     * or in the chat chat_id if it is specified.
     * Required if ephemeral_message_id isn't specified.
     */
    @JsonProperty("message_id")
    private Long messageId;

    /**
     * Optional. If the message to be replied to is from a different chat,
     * unique identifier for the chat or username of the channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private String chatId;

    /**
     * Optional. Identifier of the incoming ephemeral message that will be replied to in the current chat.
     * A reply to an ephemeral message must itself be an ephemeral message.
     * An ephemeral message may only be replied to within 15 seconds of being sent.
     * Required if message_id isn't specified.
     */
    @JsonProperty("ephemeral_message_id")
    private Long ephemeralMessageId;

    /**
     * Optional. Pass True if the message should be sent even if the specified message to be replied to is not found;
     * can be used only for replies in the same chat and forum topic.
     */
    @JsonProperty("allow_sending_without_reply")
    private Boolean allowSendingWithoutReply;

    /**
     * Optional. Quoted part of the message to be replied to; 0-1024 characters after entities parsing.
     * The quote must be an exact substring of the message to be replied to, including bold, italic, underline,
     * strikethrough, spoiler, custom_emoji, and date_time entities.
     * The message will fail to send if the quote isn't found in the original message.
     */
    private String quote;

    /**
     * Optional. Mode for parsing entities in the quote. See formatting options for more details.
     */
    @JsonProperty("quote_parse_mode")
    private ParseMode quoteParseMode;

    /**
     * Optional. A JSON-serialized list of special entities that appear in the quote.
     * It can be specified instead of quote_parse_mode.
     */
    @JsonProperty("quote_entities")
    private List<MessageEntity> quoteEntities;

    /**
     * Optional. Position of the quote in the original message in UTF-16 code units
     */
    @JsonProperty("quote_position")
    private Integer quotePosition;

    /**
     * Optional. Identifier of the specific checklist task to be replied to
     */
    @JsonProperty("checklist_task_id")
    private Integer checklistTaskId;

    /**
     * Optional. Persistent identifier of the specific poll option to be replied to
     */
    @JsonProperty("poll_option_id")
    private String pollOptionId;
}
