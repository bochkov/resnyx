package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * This object represents the audios displayed on a user's profile.
 */
@Data
@NoArgsConstructor
public final class UserProfileAudio {

    /**
     * Total number of profile audios for the target user
     */
    @JsonProperty("total_count")
    private Integer totalCount;

    /**
     * Requested profile audios
     */
    private List<Audio> audios;
}
