package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * This object represents a live photo.
 */
@Data
@NoArgsConstructor
public final class LivePhoto {

    /**
     * Optional. Available sizes of the corresponding static photo
     */
    private List<PhotoSize> photo;

    /**
     * Identifier for the video file which can be used to download or reuse the file
     */
    @JsonProperty("file_id")
    private String fileId;

    /**
     * Unique identifier for the video file which is supposed to be the same over time and for different bots.
     * Can't be used to download or reuse the file.
     */
    @JsonProperty("file_unique_id")
    private String fileUniqueId;

    /**
     * Video width as defined by the sender
     */
    private Integer width;

    /**
     * Video height as defined by the sender
     */
    private Integer height;

    /**
     * Duration of the video in seconds as defined by the sender
     */
    private Integer duration;

    /**
     * Optional. MIME type of the file as defined by the sender
     */
    @JsonProperty("mime_type")
    private String mimeType;

    /**
     * Optional. File size in bytes. It can be bigger than 2^31 and some programming languages may
     * have difficulty/silent defects in interpreting it. But it has at most 52 significant bits,
     * so a signed 64-bit integer or double-precision float type are safe for storing this value.
     */
    @JsonProperty("file_size")
    private Long fileSize;
}
