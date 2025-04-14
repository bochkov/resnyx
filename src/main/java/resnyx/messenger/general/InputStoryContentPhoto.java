package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes a photo to post as a story.
 */
@Data
@NoArgsConstructor
public final class InputStoryContentPhoto implements InputStoryContent {

    /**
     * Type of the content, must be photo
     */
    private String type;

    /**
     * The photo to post as a story. The photo must be of the size 1080x1920 and must not exceed 10 MB.
     * The photo can't be reused and can only be uploaded as a new file,
     * so you can pass “attach://&lt;file_attach_name&gt;” if the photo was uploaded using multipart/form-data under &lt;file_attach_name&gt;.
     */
    private String photo;
}
