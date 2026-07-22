package resnyx.messenger.rich;

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
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = RichDefaultString.class)
@JsonSubTypes({
        @JsonSubTypes.Type(value = RichTextBold.class, name = "bold"),
        @JsonSubTypes.Type(value = RichTextItalic.class, name = "italic"),
        @JsonSubTypes.Type(value = RichTextUnderline.class, name = "underline"),
        @JsonSubTypes.Type(value = RichTextStrikethrough.class, name = "strikethrough"),
        @JsonSubTypes.Type(value = RichTextSpoiler.class, name = "spoiler"),
        @JsonSubTypes.Type(value = RichTextDateTime.class, name = "date_time"),
        @JsonSubTypes.Type(value = RichTextTextMention.class, name = "text_mention"),
        @JsonSubTypes.Type(value = RichTextSubscript.class, name = "subscript"),
        @JsonSubTypes.Type(value = RichTextSuperscript.class, name = "superscript"),
        @JsonSubTypes.Type(value = RichTextMarked.class, name = "marked"),
        @JsonSubTypes.Type(value = RichTextCode.class, name = "code"),
        @JsonSubTypes.Type(value = RichTextCustomEmoji.class, name = "custom_emoji"),
        @JsonSubTypes.Type(value = RichTextMathematicalExpression.class, name = "mathematical_expression"),
        @JsonSubTypes.Type(value = RichTextUrl.class, name = "url"),
        @JsonSubTypes.Type(value = RichTextEmailAddress.class, name = "email_address"),
        @JsonSubTypes.Type(value = RichTextPhoneNumber.class, name = "phone_number"),
        @JsonSubTypes.Type(value = RichTextBankCardNumber.class, name = "bank_card_number"),
        @JsonSubTypes.Type(value = RichTextMention.class, name = "mention"),
        @JsonSubTypes.Type(value = RichTextHashtag.class, name = "hashtag"),
        @JsonSubTypes.Type(value = RichTextCashtag.class, name = "cashtag"),
        @JsonSubTypes.Type(value = RichTextBotCommand.class, name = "bot_command"),
        @JsonSubTypes.Type(value = RichTextAnchor.class, name = "anchor"),
        @JsonSubTypes.Type(value = RichTextAnchorLink.class, name = "anchor_link"),
        @JsonSubTypes.Type(value = RichTextReference.class, name = "reference"),
        @JsonSubTypes.Type(value = RichTextReferenceLink.class, name = "reference_link"),
})
public interface RichText {
}
