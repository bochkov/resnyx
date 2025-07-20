package resnyx.messenger.general;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * A method to get the current Telegram Stars balance of the bot.
 * Requires no parameters.
 * On success, returns a StarAmount object.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetMyStarBalance implements TgMethod {
}
