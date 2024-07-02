package resnyx.payments;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes a withdrawal transaction to the Telegram Ads platform.
 */
@Data
@NoArgsConstructor
public final class TransactionPartnerTelegramAds implements TransactionPartner {

    /**
     * Type of the transaction partner, always “telegram_ads”
     */
    private String type;
}
