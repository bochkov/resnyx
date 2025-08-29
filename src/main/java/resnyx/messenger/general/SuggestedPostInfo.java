package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeDeserializer;

import java.time.LocalDate;

/**
 * Contains information about a suggested post.
 */
@Data
@NoArgsConstructor
public final class SuggestedPostInfo {

    /**
     * State of the suggested post. Currently, it can be one of “pending”, “approved”, “declined”.
     */
    private String state;

    /**
     * Optional. Proposed price of the post. If the field is omitted, then the post is unpaid.
     */
    private SuggestedPostPrice price;

    /**
     * Optional. Proposed send date of the post. If the field is omitted, then the post can be published at any
     * time within 30 days at the sole discretion of the user or administrator who approves it.
     */
    @JsonProperty("send_date")
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDate sendDate;
}
