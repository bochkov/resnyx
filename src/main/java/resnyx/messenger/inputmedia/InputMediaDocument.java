package resnyx.messenger.inputmedia;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Caption;
import resnyx.common.InputFile;

/**
 * Represents a general file to be sent.
 */
@Data
@NoArgsConstructor
public final class InputMediaDocument implements InputMedia {

    /**
     * Type of the result, must be document
     */
    private String type;

    /**
     * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL for Telegram to get a file from the Internet,
     * or pass “attach://&lt;file_attach_name&gt;” to upload a new one using multipart/form-data under &lt;file_attach_name&gt; name.
     */
    private String media;

    /**
     * Optional. Thumbnail of the file sent
     */
    @JsonUnwrapped
    private InputFile thumbnail;

    /**
     * Optional. Caption of the document to be sent
     */
    @JsonUnwrapped
    private Caption caption;

    /**
     * Optional. Disables automatic server-side content type detection for files uploaded using multipart/form-data.
     * Always True, if the document is sent as part of an album.
     */
    @JsonProperty("disable_content_type_detection")
    private Boolean disableContentTypeDetection;
}
