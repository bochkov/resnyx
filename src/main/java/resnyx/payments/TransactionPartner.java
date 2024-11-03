package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * This object describes the source of a transaction, or its recipient for outgoing transactions. Currently, it can be one of:
 * <ul>
 * <li>{@link TransactionPartnerFragment}</li>
 * <li>{@link TransactionPartnerUser}</li>
 * <li>{@link TransactionPartnerTelegramAds}</li>
 * <li>{@link TransactionPartnerTelegramApi}</li>
 * <li>{@link TransactionPartnerOther}</li>
 * </ul>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "fragment", value = TransactionPartnerFragment.class),
        @JsonSubTypes.Type(name = "user", value = TransactionPartnerUser.class),
        @JsonSubTypes.Type(name = "telegram_ads", value = TransactionPartnerTelegramAds.class),
        @JsonSubTypes.Type(name = "telegram_api", value = TransactionPartnerTelegramApi.class),
        @JsonSubTypes.Type(name = "other", value = TransactionPartnerOther.class),
})
public interface TransactionPartner {
}
