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
public final class PassportElementErrorUnspecified implements PassportElementError {

    /**
     * Error source, must be unspecified
     */
    private String source;

    /**
     * Type of element of the user's Telegram Passport which has the issue
     */
    private PassportElementType type;

    /**
     * Base64-encoded element hash
     */
    @JsonProperty("element_hash")
    private String elementHash;

    /**
     * Error message
     */
    private String message;
}
