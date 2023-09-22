package resnyx.passport;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes documents or other Telegram Passport elements shared with the bot by the user.
 */
@Data
@NoArgsConstructor
public final class EncryptedPassportElement {

    /**
     * Element type
     */
    private PassportElementType type;

    /**
     * Optional. Base64-encoded encrypted Telegram Passport element data provided by the user,
     * available for “personal_details”, “passport”, “driver_license”, “identity_card”, “internal_passport” and “address” types.
     * Can be decrypted and verified using the accompanying EncryptedCredentials.
     */
    private String data;

    /**
     * Optional. User's verified phone number, available only for “phone_number” type
     */
    @JsonProperty("phone_number")
    private String phoneNumber;

    /**
     * Optional. User's verified email address, available only for “email” type
     */
    private String email;

    /**
     * Optional. Array of encrypted files with documents provided by the user,
     * available for “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration” and “temporary_registration” types.
     * Files can be decrypted and verified using the accompanying EncryptedCredentials.
     */
    private List<PassportFile> files;

    /**
     * Optional. Encrypted file with the front side of the document, provided by the user.
     * Available for “passport”, “driver_license”, “identity_card” and “internal_passport”.
     * The file can be decrypted and verified using the accompanying EncryptedCredentials.
     */
    @JsonProperty("front_side")
    private PassportFile frontSide;

    /**
     * Optional. Encrypted file with the reverse side of the document, provided by the user.
     * Available for “driver_license” and “identity_card”.
     * The file can be decrypted and verified using the accompanying EncryptedCredentials.
     */
    @JsonProperty("reverse_side")
    private PassportFile reverseSide;

    /**
     * Optional. Encrypted file with the selfie of the user holding a document, provided by the user;
     * available for “passport”, “driver_license”, “identity_card” and “internal_passport”.
     * The file can be decrypted and verified using the accompanying EncryptedCredentials.
     */
    private PassportFile selfie;

    /**
     * Optional. Array of encrypted files with translated versions of documents provided by the user.
     * Available if requested for “passport”, “driver_license”, “identity_card”, “internal_passport”, “utility_bill”,
     * “bank_statement”, “rental_agreement”, “passport_registration” and “temporary_registration” types.
     * Files can be decrypted and verified using the accompanying EncryptedCredentials.
     */
    private List<PassportFile> translation;

    /**
     * Base64-encoded element hash for using in PassportElementErrorUnspecified
     */
    private String hash;
}
