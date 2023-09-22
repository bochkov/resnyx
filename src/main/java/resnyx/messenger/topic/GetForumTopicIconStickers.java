package resnyx.messenger.topic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to get custom emoji stickers, which can be used as a forum topic icon by any user.
 * Requires no parameters. Returns an Array of Sticker objects.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetForumTopicIconStickers implements TgMethod {
}
