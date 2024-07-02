package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The paid media isn't available before the payment.
 */
@Data
@NoArgsConstructor
public final class PaidMediaPreview implements PaidMedia {

    /**
     * Type of the paid media, always “preview”
     */
    private String type;

    /**
     * Optional. Media width as defined by the sender
     */
    private Integer width;

    /**
     * Optional. Media height as defined by the sender
     */
    private Integer height;

    /**
     * Optional. Duration of the media in seconds as defined by the sender
     */
    private Integer duration;
}
