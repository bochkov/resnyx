package resnyx.updates;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to get current webhook status.
 * Requires no parameters.
 * On success, returns a WebhookInfo object.
 * If the bot is using getUpdates, will return an object with the url field empty.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetWebhookInfo implements TgMethod {
}
