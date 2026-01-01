package resnyx.gifts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.messenger.general.MessageEntity;

import java.util.List;

/**
 * Gifts a Telegram Premium subscription to the given user. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GiftPremiumSubscription implements TgMethod {

    /**
     * Unique identifier of the target user who will receive a Telegram Premium subscription
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * Number of months the Telegram Premium subscription will be active for the user; must be one of 3, 6, or 12
     */
    @JsonProperty("month_count")
    private final Integer monthCount;

    /**
     * Number of Telegram Stars to pay for the Telegram Premium subscription; must be 1000 for 3 months, 1500 for 6 months, and 2500 for 12 months
     */
    @JsonProperty("star_count")
    private final Integer starCount;

    /**
     * Text that will be shown along with the service message about the subscription; 0-128 characters
     */
    private String text;

    /**
     * Mode for parsing entities in the text. See formatting options for more details.
     * Entities other than “bold”, “italic”, “underline”, “strikethrough”, “spoiler”, and “custom_emoji” are ignored.
     */
    @JsonProperty("text_parse_mode")
    private String textParseMode;

    /**
     * A JSON-serialized list of special entities that appear in the gift text.
     * It can be specified instead of text_parse_mode.
     * Entities other than “bold”, “italic”, “underline”, “strikethrough”, “spoiler”, and “custom_emoji” are ignored.
     */
    @JsonProperty("text_entities")
    private List<MessageEntity> textEntities;
}
