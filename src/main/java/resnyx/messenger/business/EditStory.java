package resnyx.messenger.business;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.ParseMode;
import resnyx.messenger.general.InputStoryContent;
import resnyx.messenger.general.MessageEntity;
import resnyx.messenger.general.StoryArea;

import java.util.List;

/**
 * Edits a story previously posted by the bot on behalf of a managed business account.
 * Requires the <i>can_manage_stories</i> business bot right.
 * Returns {@link resnyx.messenger.general.Story} on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class EditStory implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which to read the message
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;

    /**
     * Unique identifier of the story to edit
     */
    @JsonProperty("story_id")
    private String storyId;

    /**
     * Content of the story
     */
    private final InputStoryContent content;

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

}
