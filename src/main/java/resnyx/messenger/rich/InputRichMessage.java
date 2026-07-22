package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Describes a rich message to be sent. Exactly one of the fields html, markdown, or blocks must be used.
 */
@Data
@NoArgsConstructor
public final class InputRichMessage {

    /**
     * Optional. Content of the rich message to send described as a list of blocks
     */
    private List<InputRichBlock> blocks;

    /**
     * Optional. Content of the rich message to send described using HTML formatting.
     * See rich message formatting options for more details. Use media field to specify the media used in the message.
     */
    private String html;

    /**
     * Optional. Content of the rich message to send described using Markdown formatting.
     * See rich message formatting options for more details. Use media field to specify the media used in the message.
     */
    private String markdown;

    /**
     * Optional. List of media that are specified in the markdown or html fields
     * using tg://photo?id=, tg://video?id=, and tg://audio?id= links
     */
    private List<InputRichMessageMedia> media;

    /**
     * Optional. Pass True if the rich message must be shown right-to-left
     */
    @JsonProperty("is_rtl")
    private Boolean isRightToLeft;

    /**
     * Optional. Pass True to skip automatic detection of entities
     * (e.g., URLs, email addresses, username mentions, hashtags, cashtags, bot commands, or phone numbers) in the text
     */
    @JsonProperty("skip_entity_detection")
    private Boolean skipEntityDetection;
}
