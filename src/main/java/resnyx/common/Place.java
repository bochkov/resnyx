package resnyx.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class Place {

    /**
     * Optional. Identifier of the venue
     */
    private String id;

    /**
     * Type of the venue
     */
    private String type;

}
