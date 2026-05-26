package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The paid media to send is a live photo.
 */
@Data
@NoArgsConstructor
public class InputPaidMediaLivePhoto implements InputPaidMedia {

    /**
     * Type of the media, must be live_photo
     */
    private String type;

    /**
     * Video of the live photo to send.
     * Pass a file_id to send a file that exists on the Telegram servers (recommended)
     * or pass “attach://&lt;file_attach_name&gt;” to upload a new one using multipart/form-data
     * under &lt;file_attach_name&gt; name.
     * Sending live photos by a URL is currently unsupported.
     */
    private String media;

    /**
     * The static photo to send. Pass a file_id to send a file that exists on the Telegram servers (recommended)
     * or pass “attach://&lt;file_attach_name&gt;” to upload a new one using multipart/form-data
     * under &lt;file_attach_name&gt; name.
     * Sending live photos by a URL is currently unsupported.
     */
    private String photo;
}
