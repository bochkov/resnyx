package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public final class BusinessOpeningHoursInterval {

    /**
     * The minute's sequence number in a week, starting on Monday,
     * marking the start of the time interval during which the business is open; 0 - 7 * 24 * 60
     */
    @JsonProperty("opening_minute")
    private Integer openingMinute;

    /**
     * The minute's sequence number in a week, starting on Monday,
     * marking the end of the time interval during which the business is open; 0 - 8 * 24 * 60
     */
    @JsonProperty("closing_minute")
    private Integer closingMinute;
}
