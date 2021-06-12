package resnyx.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represent a user's profile pictures.
 */
@Data
public final class UserProfilePhotos {

    /**
     * Total number of profile pictures the target user has
     */
    @JsonProperty("total_count")
    private Integer totalCount;

    /**
     * Requested profile pictures (in up to 4 sizes each)
     */
    private List<List<PhotoSize>> photos;
}
