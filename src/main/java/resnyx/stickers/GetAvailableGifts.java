package resnyx.stickers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Returns the list of gifts that can be sent by the bot to users. Requires no parameters. Returns a Gifts object.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetAvailableGifts implements TgMethod {
}
