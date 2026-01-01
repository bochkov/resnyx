package resnyx.updates;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.InputFile;

import java.util.List;

/**
 * Use this method to specify a URL and receive incoming updates via an outgoing webhook.
 * Whenever there is an update for the bot, we will send an HTTPS POST request to the specified URL, containing a JSON-serialized Update.
 * In case of an unsuccessful request, we will give up after a reasonable amount of attempts.
 * Returns True on success.
 * <p>
 * If you'd like to make sure that the webhook was set by you, you can specify secret data in the parameter secret_token.
 * If specified, the request will contain a header “X-Telegram-Bot-Api-Secret-Token” with the secret token as content.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetWebhook implements TgMethod {

    /**
     * HTTPS URL to send updates to. Use an empty string to remove webhook integration
     */
    private final String url;

    /**
     * Upload your public key certificate so that the root certificate in use can be checked.
     * See self-signed guide for details.
     */
    private InputFile certificate;

    /**
     * The fixed IP address which will be used to send webhook requests instead of the IP address resolved through DNS
     */
    @JsonProperty("ip_address")
    private String ipAddress;

    /**
     * The maximum allowed number of simultaneous HTTPS connections to the webhook for update delivery, 1-100.
     * Defaults to 40.
     * Use lower values to limit the load on your bot's server, and higher values to increase your bot's throughput.
     */
    @JsonProperty("max_connections")
    private Integer maxConnections;

    /**
     * A JSON-serialized list of the update types you want your bot to receive.
     * For example, specify [“message”, “edited_channel_post”, “callback_query”] to only receive updates of these types.
     * See Update for a complete list of available update types.
     * Specify an empty list to receive all update types except chat_member (default).
     * If not specified, the previous setting will be used.
     * <p>
     * Please note that this parameter doesn't affect updates created before the call to the setWebhook,
     * so unwanted updates may be received for a short period of time.
     */
    @JsonProperty("allowed_updates")
    private List<UpdateType> allowedUpdates;

    /**
     * Pass True to drop all pending updates
     */
    @JsonProperty("drop_pending_updates")
    private Boolean dropPendingUpdates;

    /**
     * A secret token to be sent in a header “X-Telegram-Bot-Api-Secret-Token” in every webhook request, 1-256 characters.
     * Only characters A-Z, a-z, 0-9, _ and - are allowed.
     * The header is useful to ensure that the request comes from a webhook set by you.
     */
    @JsonProperty("secret_token")
    private String secretToken;
}
