package resnyx.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents an issue with a document scan.
 * The error is considered resolved when the file with the document scan changes.
 */
@Data
@NoArgsConstructor
public final class PassportElementErrorFile implements PassportElementError {

    /**
     * Error source, must be file
     */
    private String source;

    /**
     * The section of the user's Telegram Passport which has the issue,
     * one of “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration”, “temporary_registration”
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
