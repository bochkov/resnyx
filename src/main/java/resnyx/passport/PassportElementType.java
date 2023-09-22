package resnyx.passport;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum PassportElementType {

    PERSONAL_DETAILS("personal_details"),
    PASSPORT("passport"),
    DRIVER_LICENSE("driver_license"),
    IDENTITY_CARD("identity_card"),
    INTERNAL_PASSPORT("internal_passport"),
    ADDRESS("address"),
    UTILITY_BILL("utility_bill"),
    BANK_STATEMENT("bank_statement"),
    RENTAL_AGREEMENT("rental_agreement"),
    PASSPORT_REGISTRATION("passport_registration"),
    TEMPORARY_REGISTRATION("temporary_registration"),
    PHONE_NUMBER("phone_number"),
    EMAIL("email");

    private final String value;

    @JsonValue
    public String value() {
        return value;
    }
}
