package resnyx.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents an issue with one of the files that constitute the translation of a document.
 * The error is considered resolved when the file changes.
 */
@Data
@NoArgsConstructor
public final class PassportElementErrorTranslationFile implements PassportElementError {

    /**
     * Error source, must be translation_file
     */
    private String source;

    /**
     * Type of element of the user's Telegram Passport which has the issue,
     * one of “passport”, “driver_license”, “identity_card”, “internal_passport”, “utility_bill”, “bank_statement”,
     * “rental_agreement”, “passport_registration”, “temporary_registration”
     */
    private PassportElementType type;

    /**
     * Base64-encoded file hash
     */
    @JsonProperty("file_hash")
    private String fileHash;

    /**
     * Error message
     */
    private String message;
}
