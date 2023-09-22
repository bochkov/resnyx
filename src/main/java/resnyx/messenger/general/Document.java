package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.FileAttr;

/**
 * This object represents a general file (as opposed to photos, voice messages and audio files).
 */
@Data
@NoArgsConstructor
public final class Document {

    @JsonUnwrapped
    private FileAttr fileAttr;

    /**
     * Optional. Document thumbnail as defined by sender
     */
    private PhotoSize thumbnail;

    /**
     * Optional. Original filename as defined by sender
     */
    @JsonProperty("file_name")
    private String fileName;

    /**
     * Optional. MIME type of the file as defined by sender
     */
    @JsonProperty("mime_type")
    private String mimeType;
}
