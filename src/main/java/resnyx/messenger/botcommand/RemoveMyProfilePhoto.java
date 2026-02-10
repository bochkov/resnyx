package resnyx.messenger.botcommand;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Removes the profile photo of the bot. Requires no parameters. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class RemoveMyProfilePhoto implements TgMethod {
}
