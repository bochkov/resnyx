package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * This object describes the state of a revenue withdrawal operation. Currently, it can be one of
 * <p>
 * {@link RevenueWithdrawalStatePending}
 * {@link RevenueWithdrawalStateSucceeded}
 * {@link RevenueWithdrawalStateFailed}
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "pending", value = RevenueWithdrawalStatePending.class),
        @JsonSubTypes.Type(name = "succeeded", value = RevenueWithdrawalStateSucceeded.class),
        @JsonSubTypes.Type(name = "failed", value = RevenueWithdrawalStateFailed.class),
})
public interface RevenueWithdrawalState {
}
