package resnyx.messenger.general;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * An animated profile photo in the MPEG4 format.
 */
@Data
@NoArgsConstructor
public final class InputProfilePhotoAnimated implements InputProfilePhoto {

    /**
     * Type of the profile photo, must be <i>animated</i>
     */
    private String type;

    /**
     * The animated profile photo. Profile photos can't be reused and can only be uploaded as a new file,
     * so you can pass "attach://&lt;file_attach_name&gt;" if the photo was uploaded using multipart/form-data
     * under &lt;file_attach_name&gt;.
     */
    private String animation;

    /**
     * Optional. Timestamp in seconds of the frame that will be used as the static profile photo. Defaults to 0.0.
     */
    @JsonProperty("main_frame_timestamp")
    private Double mainFrameTimestamp;
}
