package resnyx.passport;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes data required for decrypting and authenticating EncryptedPassportElement.
 * See the Telegram Passport Documentation for a complete description of the data decryption and authentication processes.
 */
@Data
@NoArgsConstructor
public final class EncryptedCredentials {

    /**
     * Base64-encoded encrypted JSON-serialized data with unique user's payload,
     * data hashes and secrets required for EncryptedPassportElement decryption and authentication
     */
    private String data;

    /**
     * Base64-encoded data hash for data authentication
     */
    private String hash;

    /**
     * Base64-encoded secret, encrypted with the bot's public RSA key, required for data decryption
     */
    private String secret;
}
