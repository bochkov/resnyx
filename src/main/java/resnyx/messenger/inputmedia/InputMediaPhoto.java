package resnyx.messenger.inputmedia;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Caption;

/**
 * Represents a photo to be sent.
 */
@Data
@NoArgsConstructor
public final class InputMediaPhoto implements InputMedia {

    /**
     * Type of the result, must be photo
     */
    private String type;

    /**
     * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL for Telegram to get a file from the Internet,
     * or pass “attach://&lt;file_attach_name&gt;” to upload a new one using multipart/form-data under &lt;file_attach_name&gt; name.
     */
    private String media;

    @JsonUnwrapped
    private Caption caption;

    /**
     * Optional. Pass True if the photo needs to be covered with a spoiler animation
     */
    @JsonProperty("has_spoiler")
    private Boolean hasSpoiler;
}
