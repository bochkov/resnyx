package resnyx.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

import java.util.List;

/**
 * Informs a user that some of the Telegram Passport elements they provided contains errors.
 * The user will not be able to re-submit their Passport to you until the errors are fixed
 * (the contents of the field for which you returned the error must change).
 * Returns True on success.
 * <p>
 * Use this if the data submitted by the user doesn't satisfy the standards your service requires for any reason.
 * For example, if a birthday date seems invalid, a submitted document is blurry, a scan shows evidence of tampering, etc.
 * Supply some details in the error message to make sure the user knows how to correct the issues.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetPassportDataErrors implements TgMethod {

    /**
     * User identifier
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * A JSON-serialized array describing the errors
     */
    private final List<PassportElementError> errors;

}
