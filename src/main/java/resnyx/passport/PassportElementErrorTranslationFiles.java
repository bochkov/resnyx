package resnyx.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Represents an issue with the translated version of a document.
 * The error is considered resolved when a file with the document translation change.
 */
@Data
@NoArgsConstructor
public final class PassportElementErrorTranslationFiles implements PassportElementError {

    /**
     * Error source, must be translation_files
     */
    private String source;

    /**
     * Type of element of the user's Telegram Passport which has the issue,
     * one of “passport”, “driver_license”, “identity_card”, “internal_passport”, “utility_bill”, “bank_statement”,
     * “rental_agreement”, “passport_registration”, “temporary_registration”
     */
    private PassportElementType type;

    /**
     * List of base64-encoded file hashes
     */
    @JsonProperty("file_hashes")
    private List<String> fileHashes;

    /**
     * Error message
     */
    private String message;
}
