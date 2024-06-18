package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * This object describes the source of a transaction, or its recipient for outgoing transactions. Currently, it can be one of:
 * <p>
 * {@link TransactionPartnerFragment}
 * {@link TransactionPartnerUser}
 * {@link TransactionPartnerOther}
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "fragment", value = TransactionPartnerFragment.class),
        @JsonSubTypes.Type(name = "user", value = TransactionPartnerUser.class),
        @JsonSubTypes.Type(name = "other", value = TransactionPartnerOther.class),
})
public interface TransactionPartner {
}
