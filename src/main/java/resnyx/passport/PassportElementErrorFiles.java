package resnyx.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Represents an issue with a list of scans.
 * The error is considered resolved when the list of files containing the scans changes.
 */
@Data
@NoArgsConstructor
public final class PassportElementErrorFiles implements PassportElementError {

    /**
     * Error source, must be files
     */
    private String source;

    /**
     * The section of the user's Telegram Passport which has the issue,
     * one of “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration”, “temporary_registration”
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
