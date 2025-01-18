package resnyx.stickers;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Removes verification from a chat that is currently verified on behalf of the organization represented by the bot.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class RemoveChatVerification implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;
}
