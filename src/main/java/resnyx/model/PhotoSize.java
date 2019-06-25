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
