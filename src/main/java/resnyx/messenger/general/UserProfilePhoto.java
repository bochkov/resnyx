package resnyx.messenger.general;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represent a user's profile pictures.
 */
@Data
@NoArgsConstructor
public final class UserProfilePhoto {

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
