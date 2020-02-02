package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represents one size of a photo or a
 * <a href="https://core.telegram.org/bots/api#document">file</a> /
 * <a href="https://core.telegram.org/bots/api#sticker">sticker</a> thumbnail.
 */
@Data
public final class PhotoSize {

    /**
     * Unique identifier for this file
     */
    @JsonProperty("file_id")
    private String id;

    /**
     * Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
     */
    @JsonProperty("file_unique_id")
    private String uniqueId;

    /**
     * Photo width
     */
    private Integer width;

    /**
     * Photo height
     */
    private Integer height;

    /**
     * Optional. File size
     */
    @JsonProperty("file_size")
    private Integer size;
}
