package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * This object represents a block in a rich formatted message to be sent. Currently, it can be any of the following types:
 *
 * <ul>
 *   <li>{@link InputRichBlockParagraph}</li>
 *   <li>{@link InputRichBlockSectionHeading}</li>
 *   <li>{@link InputRichBlockPreformatted}</li>
 *   <li>{@link InputRichBlockFooter}</li>
 *   <li>{@link InputRichBlockDivider}</li>
 *   <li>{@link InputRichBlockMathematicalExpression}</li>
 *   <li>{@link InputRichBlockAnchor}</li>
 *   <li>{@link InputRichBlockList}</li>
 *   <li>{@link InputRichBlockBlockQuotation}</li>
 *   <li>{@link InputRichBlockPullQuotation}</li>
 *   <li>{@link InputRichBlockCollage}</li>
 *   <li>{@link InputRichBlockSlideshow}</li>
 *   <li>{@link InputRichBlockTable}</li>
 *   <li>{@link InputRichBlockDetails}</li>
 *   <li>{@link InputRichBlockMap}</li>
 *   <li>{@link InputRichBlockAnimation}</li>
 *   <li>{@link InputRichBlockAudio}</li>
 *   <li>{@link InputRichBlockPhoto}</li>
 *   <li>{@link InputRichBlockVideo}</li>
 *   <li>{@link InputRichBlockVoiceNote}</li>
 *   <li>{@link InputRichBlockThinking}</li>
 * </ul>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = InputRichBlockParagraph.class, name = "paragraph"),
        @JsonSubTypes.Type(value = InputRichBlockSectionHeading.class, name = "heading"),
        @JsonSubTypes.Type(value = InputRichBlockPreformatted.class, name = "pre"),
        @JsonSubTypes.Type(value = InputRichBlockFooter.class, name = "footer"),
        @JsonSubTypes.Type(value = InputRichBlockDivider.class, name = "divider"),
        @JsonSubTypes.Type(value = InputRichBlockMathematicalExpression.class, name = "mathematical_expression"),
        @JsonSubTypes.Type(value = InputRichBlockAnchor.class, name = "anchor"),
        @JsonSubTypes.Type(value = InputRichBlockList.class, name = "list"),
        @JsonSubTypes.Type(value = InputRichBlockBlockQuotation.class, name = "blockquote"),
        @JsonSubTypes.Type(value = InputRichBlockPullQuotation.class, name = "pullquote"),
        @JsonSubTypes.Type(value = InputRichBlockSlideshow.class, name = "slideshow"),
        @JsonSubTypes.Type(value = InputRichBlockTable.class, name = "table"),
        @JsonSubTypes.Type(value = InputRichBlockDetails.class, name = "details"),
        @JsonSubTypes.Type(value = InputRichBlockMap.class, name = "map"),
        @JsonSubTypes.Type(value = InputRichBlockAnimation.class, name = "animation"),
        @JsonSubTypes.Type(value = InputRichBlockAudio.class, name = "audio"),
        @JsonSubTypes.Type(value = InputRichBlockPhoto.class, name = "photo"),
        @JsonSubTypes.Type(value = InputRichBlockVideo.class, name = "video"),
        @JsonSubTypes.Type(value = InputRichBlockVoiceNote.class, name = "voice_note"),
        @JsonSubTypes.Type(value = InputRichBlockThinking.class, name = "thinking"),
})
public interface InputRichBlock {
}
