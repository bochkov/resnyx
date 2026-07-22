package resnyx.rich;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * This object represents a rich formatted text.
 * Currently, it can be either a String for plain text, an Array of RichText, or any of the following types:
 * <ul>
 * <li>{@link RichTextBold}</li>
 * <li>{@link RichTextItalic}</li>
 * <li>{@link RichTextUnderline}</li>
 * <li>{@link RichTextStrikethrough}</li>
 * <li>{@link RichTextSpoiler}</li>
 * <li>{@link RichTextDateTime}</li>
 * <li>{@link RichTextTextMention}</li>
 * <li>{@link RichTextSubscript}</li>
 * <li>{@link RichTextSuperscript}</li>
 * <li>{@link RichTextMarked}</li>
 * <li>{@link RichTextCode}</li>
 * <li>{@link RichTextCustomEmoji}</li>
 * <li>{@link RichTextMathematicalExpression}</li>
 * <li>{@link RichTextUrl}</li>
 * <li>{@link RichTextEmailAddress}</li>
 * <li>{@link RichTextPhoneNumber}</li>
 * <li>{@link RichTextBankCardNumber}</li>
 * <li>{@link RichTextMention}</li>
 * <li>{@link RichTextHashtag}</li>
 * <li>{@link RichTextCashtag}</li>
 * <li>{@link RichTextBotCommand}</li>
 * <li>{@link RichTextAnchor}</li>
 * <li>{@link RichTextAnchorLink}</li>
 * <li>{@link RichTextReference}</li>
 * <li>{@link RichTextReferenceLink}</li>
 * </ul>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
})
public interface RichText {
}
