package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * This object contains information about the quoted part of a message that is replied to by the given message.
 */
@Data
@NoArgsConstructor
public final class TextQuote {

    /**
     * Text of the quoted part of a message that is replied to by the given message
     */
    private String text;

    /**
     * Optional. Special entities that appear in the quote.
     * Currently, only bold, italic, underline, strikethrough, spoiler, and custom_emoji entities are kept in quotes.
     */
    private List<MessageEntity> entities;

    /**
     * Approximate quote position in the original message in UTF-16 code units as specified by the sender
     */
    private Integer position;

    /**
     * Optional. True, if the quote was chosen manually by the message sender.
     * Otherwise, the quote was added automatically by the server.
     */
    @JsonProperty("is_manual")
    private Boolean isManual;
}
