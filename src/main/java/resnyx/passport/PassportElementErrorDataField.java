package resnyx.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents an issue in one of the data fields that was provided by the user.
 * The error is considered resolved when the field's value changes.
 */
@Data
@NoArgsConstructor
public final class PassportElementErrorDataField implements PassportElementError {

    /**
     * Error source, must be data
     */
    private String source;

    /**
     * The section of the user's Telegram Passport which has the error,
     * one of “personal_details”, “passport”, “driver_license”, “identity_card”, “internal_passport”, “address”
     */
    private PassportElementType type;

    /**
     * Name of the data field which has the error
     */
    @JsonProperty("field_name")
    private String fieldName;

    /**
     * Base64-encoded data hash
     */
    private String data;

    /**
     * Error message
     */
    private String message;
}
