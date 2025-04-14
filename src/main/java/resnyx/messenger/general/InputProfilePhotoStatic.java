package resnyx.messenger.general;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A static profile photo in the .JPG format.
 */
@Data
@NoArgsConstructor
public final class InputProfilePhotoStatic implements InputProfilePhoto {

    /**
     * Type of the profile photo, must be <i>static</i>
     */
    private String type;

    /**
     * The static profile photo. Profile photos can't be reused and can only be uploaded as a new file,
     * so you can pass "attach://&lt;file_attach_name&gt;" if the photo was uploaded using multipart/form-data
     * under &lt;file_attach_name&gt;.
     */
    private String photo;
}
