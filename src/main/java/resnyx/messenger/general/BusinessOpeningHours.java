package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public final class BusinessOpeningHours {

    /**
     * Unique name of the time zone for which the opening hours are defined
     */
    @JsonProperty("time_zone_name")
    private String timeZoneName;

    /**
     * List of time intervals describing business opening hours
     */
    @JsonProperty("opening_hours")
    private List<BusinessOpeningHoursInterval> openingHours;
}
