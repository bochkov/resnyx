package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The paid media to send is a photo.
 */
@Data
@NoArgsConstructor
public final class InputPaidMediaPhoto implements InputPaidMedia {

    /**
     * Type of the media, must be photo
     */
    private String type;

    /**
     * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL for Telegram to get a file from the Internet, or pass “attach://<file_attach_name>”
     * to upload a new one using multipart/form-data under <file_attach_name> name.
     */
    private String media;
}
