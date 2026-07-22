package resnyx.messenger.inputmedia;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents an HTTP link to be sent.
 */
@Data
@NoArgsConstructor
public final class InputMediaLink implements InputMedia, InputPollOptionMedia {

    /**
     * Type of the media, must be link
     */
    private String type;

    /**
     * HTTP URL of the link
     */
    private String url;
}
