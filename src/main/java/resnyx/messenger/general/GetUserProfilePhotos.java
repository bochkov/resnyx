package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to get a list of profile pictures for a user. Returns a UserProfilePhotos object.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetUserProfilePhotos implements TgMethod {

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * Sequential number of the first photo to be returned. By default, all photos are returned.
     */
    private Integer offset;

    /**
     * Limits the number of photos to be retrieved. Values between 1-100 are accepted. Defaults to 100.
     */
    private Integer limit;
}
