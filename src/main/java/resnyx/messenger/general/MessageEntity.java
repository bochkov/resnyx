package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents one special entity in a text message. For example, hashtags, usernames, URLs, etc.
 */
@Data
@NoArgsConstructor
public final class MessageEntity {

    /**
     * Type of the entity
     */
    private MessageEntityType type;

    /**
     * Offset in UTF-16 code units to the start of the entity
     */
    private Integer offset;

    /**
     * Length of the entity in UTF-16 code units
     */
    private Integer length;

    /**
     * Optional. For “text_link” only, URL that will be opened after user taps on the text
     */
    private String url;

    /**
     * Optional. For “text_mention” only, the mentioned user
     */
    private User user;

    /**
     * Optional. For “pre” only, the programming language of the entity text
     */
    private String language;

    /**
     * Optional. For “custom_emoji” only, unique identifier of the custom emoji.
     * Use getCustomEmojiStickers to get full information about the sticker
     */
    @JsonProperty("custom_emoji_id")
    private String customEmojiId;
}
