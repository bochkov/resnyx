package resnyx.common;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes a Web App.
 */
@Data
@NoArgsConstructor
public final class WebAppInfo {

    /**
     * An HTTPS URL of a Web App to be opened with additional data as specified in Initializing Web Apps
     */
    private String url;
}
