package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.util.UnixTimeSerializer;

import java.time.LocalDateTime;

/**
 * Changes the emoji status for a given user that previously allowed the bot to manage their
 * emoji status via the Mini App method requestEmojiStatusAccess. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetUserEmojiStatus implements TgMethod {

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * Custom emoji identifier of the emoji status to set. Pass an empty string to remove the status.
     */
    @JsonProperty("emoji_status_custom_emoji_id")
    private final String emojiStatusCustomEmojiId;

    /**
     * Expiration date of the emoji status, if any
     */
    @JsonProperty("emoji_status_expiration_date")
    @JsonSerialize(using = UnixTimeSerializer.class)
    private final LocalDateTime emojiStatusExpirationDate;
}
