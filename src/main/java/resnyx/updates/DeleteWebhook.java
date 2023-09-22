package resnyx.updates;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to remove webhook integration if you decide to switch back to getUpdates.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class DeleteWebhook implements TgMethod {

    /**
     * Pass True to drop all pending updates
     */
    @JsonProperty("drop_pending_updates")
    private Boolean dropPendingUpdates;
}
