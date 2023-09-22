package resnyx.updates;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes the current status of a webhook.
 */
@Data
@NoArgsConstructor
public final class WebhookInfo {

    /**
     * Webhook URL, may be empty if webhook is not set up
     */
    private String url;

    /**
     * True, if a custom certificate was provided for webhook certificate checks
     */
    @JsonProperty("has_custom_certificate")
    private Boolean hasCustomCertificate;

    /**
     * Number of updates awaiting delivery
     */
    @JsonProperty("pending_update_count")
    private Integer pendingUpdateCount;
}
