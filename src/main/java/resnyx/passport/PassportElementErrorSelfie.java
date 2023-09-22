package resnyx.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents an issue with the selfie with a document.
 * The error is considered resolved when the file with the selfie changes.
 */
@Data
@NoArgsConstructor
public final class PassportElementErrorSelfie implements PassportElementError {

    /**
     * Error source, must be selfie
     */
    private String source;

    /**
     * The section of the user's Telegram Passport which has the issue,
     * one of “passport”, “driver_license”, “identity_card”, “internal_passport”
     */
    private PassportElementType type;

    /**
     * Base64-encoded hash of the file with the selfie
     */
    @JsonProperty("file_hash")
    private String fileHash;

    /**
     * Error message
     */
    private String message;
}
