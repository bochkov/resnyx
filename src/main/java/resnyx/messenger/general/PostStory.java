package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.ParseMode;

import java.util.List;

/**
 * Posts a story on behalf of a managed business account.
 * Requires the <i>can_manage_stories</i> business bot right.
 * Returns {@link resnyx.messenger.general.Story} on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class PostStory implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which to read the message
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;

    /**
     * Content of the story
     */
    private final InputStoryContent content;

    /**
     * Period after which the story is moved to the archive, in seconds;
     * must be one of 6 * 3600, 12 * 3600, 86400, or 2 * 86400
     */
    @JsonProperty("active_period")
    private final Integer activePeriod;

    /**
     * Caption of the story, 0-2048 characters after entities parsing
     */
    private String caption;

    /**
     * Mode for parsing entities in the story caption.
     */
    @JsonProperty("parse_mode")
    private ParseMode parseMode;

    /**
     * A JSON-serialized list of special entities that appear in the caption, which can be specified instead of parse_mode
     */
    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities;

    /**
     * A JSON-serialized list of clickable areas to be shown on the story
     */
    private List<StoryArea> areas;

    /**
     * Pass True to keep the story accessible after it expires
     */
    @JsonProperty("post_to_chat_page")
    private Boolean postToChatPage;

    /**
     * Pass True if the content of the story must be protected from forwarding and screenshotting
     */
    @JsonProperty("protect_content")
    private Boolean protectContent;
}
