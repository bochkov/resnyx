package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.FileAttr;

/**
 * This object represents a voice note.
 */
@Data
@NoArgsConstructor
public final class Voice {

    @JsonUnwrapped
    private FileAttr fileAttr;

    /**
     * Duration of the audio in seconds as defined by sender
     */
    private Integer duration;

    /**
     * Optional. MIME type of the file as defined by sender
     */
    @JsonProperty("mime_type")
    private String mimeType;

}
