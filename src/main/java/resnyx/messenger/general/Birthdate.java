package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public final class Birthdate {

    /**
     * Day of the user's birth; 1-31
     */
    private Integer day;

    /**
     * Month of the user's birth; 1-12
     */
    private Integer month;

    /**
     * Optional. Year of the user's birth
     */
    private Integer year;
}
