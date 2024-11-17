package resnyx.stickers;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.ParseMode;
import resnyx.messenger.general.MessageEntity;

import java.util.List;

/**
 * Sends a gift to the given user. The gift can't be converted to Telegram Stars by the user. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendGift implements TgMethod {

    /**
     * Unique identifier of the target user that will receive the gift
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * Identifier of the gift
     */
    @JsonProperty("gift_id")
    private final String giftId;

    /**
     * Text that will be shown along with the gift; 0-255 characters
     */
    private String text;

    /**
     * Mode for parsing entities in the text. See formatting options for more details.
     * Entities other than “bold”, “italic”, “underline”, “strikethrough”, “spoiler”, and “custom_emoji” are ignored.
     */
    @JsonProperty("text_parse_mode")
    private ParseMode textParseMode;

    /**
     * A JSON-serialized list of special entities that appear in the gift text.
     * It can be specified instead of text_parse_mode.
     * Entities other than “bold”, “italic”, “underline”, “strikethrough”, “spoiler”, and “custom_emoji” are ignored.
     */
    @JsonProperty("text_entities")
    private List<MessageEntity> textEntities;
}
