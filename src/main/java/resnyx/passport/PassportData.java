package resnyx.passport;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes Telegram Passport data shared with the bot by the user.
 */
@Data
@NoArgsConstructor
public final class PassportData {

    /**
     * Array with information about documents and other Telegram Passport elements that was shared with the bot
     */
    private List<EncryptedPassportElement> data;

    /**
     * Encrypted credentials required to decrypt the data
     */
    private EncryptedCredentials credentials;
}
