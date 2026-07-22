package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * This object represents a block in a rich formatted message. Currently, it can be any of the following types:
 *
 * <ul>
 * <li>{@link RichBlockParagraph}</li>
 * <li>{@link RichBlockSectionHeading}</li>
 * <li>{@link RichBlockPreformatted}</li>
 * <li>{@link RichBlockFooter}</li>
 * <li>{@link RichBlockDivider}</li>
 * <li>{@link RichBlockMathematicalExpression}</li>
 * <li>{@link RichBlockAnchor}</li>
 * <li>{@link RichBlockList}</li>
 * <li>{@link RichBlockBlockQuotation}</li>
 * <li>{@link RichBlockPullQuotation}</li>
 * <li>{@link RichBlockCollage}</li>
 * <li>{@link RichBlockSlideshow}</li>
 * <li>{@link RichBlockTable}</li>
 * <li>{@link RichBlockDetails}</li>
 * <li>{@link RichBlockMap}</li>
 * <li>{@link RichBlockAnimation}</li>
 * <li>{@link RichBlockAudio}</li>
 * <li>{@link RichBlockPhoto}</li>
 * <li>{@link RichBlockVideo}</li>
 * <li>{@link RichBlockVoiceNote}</li>
 * <li>{@link RichBlockThinking}</li>
 * </ul>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = RichBlockParagraph.class, name = "paragraph"),
        @JsonSubTypes.Type(value = RichBlockSectionHeading.class, name = "heading"),
        @JsonSubTypes.Type(value = RichBlockPreformatted.class, name = "pre"),
        @JsonSubTypes.Type(value = RichBlockFooter.class, name = "footer"),
        @JsonSubTypes.Type(value = RichBlockDivider.class, name = "divider"),
        @JsonSubTypes.Type(value = RichBlockMathematicalExpression.class, name = "mathematical_expression"),
        @JsonSubTypes.Type(value = RichBlockAnchor.class, name = "anchor"),
        @JsonSubTypes.Type(value = RichBlockList.class, name = "list"),
        @JsonSubTypes.Type(value = RichBlockBlockQuotation.class, name = "blockquote"),
        @JsonSubTypes.Type(value = RichBlockPullQuotation.class, name = "pullquote"),
        @JsonSubTypes.Type(value = RichBlockCollage.class, name = "collage"),
        @JsonSubTypes.Type(value = RichBlockSlideshow.class, name = "slideshow"),
        @JsonSubTypes.Type(value = RichBlockTable.class, name = "table"),
        @JsonSubTypes.Type(value = RichBlockDetails.class, name = "details"),
        @JsonSubTypes.Type(value = RichBlockMap.class, name = "map"),
        @JsonSubTypes.Type(value = RichBlockAnimation.class, name = "animation"),
        @JsonSubTypes.Type(value = RichBlockAudio.class, name = "audio"),
        @JsonSubTypes.Type(value = RichBlockPhoto.class, name = "photo"),
        @JsonSubTypes.Type(value = RichBlockVideo.class, name = "video"),
        @JsonSubTypes.Type(value = RichBlockVoiceNote.class, name = "voice_note"),
        @JsonSubTypes.Type(value = RichBlockThinking.class, name = "thinking"),
})
public interface RichBlock {
}
