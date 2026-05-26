package resnyx.messenger.botcommand;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to get the access settings of a managed bot.
 * Returns a BotAccessSettings object on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetManagedBotAccessSettings implements TgMethod {

    /**
     * User identifier of the managed bot whose access settings will be returned
     */
    @JsonProperty("user_id")
    private Long userId;
}
