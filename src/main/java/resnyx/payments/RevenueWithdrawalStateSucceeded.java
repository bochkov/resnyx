package resnyx.payments;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeDeserializer;

import java.time.LocalDate;

/**
 * The withdrawal succeeded.
 */
@Data
@NoArgsConstructor
public final class RevenueWithdrawalStateSucceeded implements RevenueWithdrawalState {

    /**
     * Type of the state, always “succeeded”
     */
    private String type;

    /**
     * Date the withdrawal was completed in Unix time
     */
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDate date;

    /**
     * An HTTPS URL that can be used to see transaction details
     */
    private String url;
}
