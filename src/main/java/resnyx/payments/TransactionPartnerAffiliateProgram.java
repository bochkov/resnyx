package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;

/**
 * Describes the affiliate program that issued the affiliate commission received via this transaction.
 */
@Data
@NoArgsConstructor
public final class TransactionPartnerAffiliateProgram implements TransactionPartner {

    /**
     * Type of the transaction partner, always “affiliate_program”
     */
    private String type;

    /**
     * Optional. Information about the bot that sponsored the affiliate program
     */
    @JsonProperty("sponsor_user")
    private User sponsorUser;

    /**
     * The number of Telegram Stars received by the bot for each 1000 Telegram Stars received by the affiliate program sponsor from referred users
     */
    @JsonProperty("commission_per_mille")
    private Integer commissionPerMille;
}
