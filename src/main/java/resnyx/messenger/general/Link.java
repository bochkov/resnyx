package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents an HTTP link.
 */
@Data
@NoArgsConstructor
public final class Link {

    /**
     * URL of the link
     */
    private String url;
}
