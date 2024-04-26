package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public final class BusinessLocation {

    /**
     * Address of the business
     */
    private String address;

    /**
     * Optional. Location of the business
     */
    private Location location;
}
