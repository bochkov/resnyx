package resnyx.methods.other;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.TgMethod;
import resnyx.Types;
import resnyx.model.UserProfilePhotos;

/**
 * Use this method to get a list of profile pictures for a user.
 * Returns a UserProfilePhotos object.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class GetUserProfilePhotos extends TgMethod<UserProfilePhotos> {

    public static final String METHOD = "getUserProfilePhotos";

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Long userId;

    /**
     * Optional. Sequential number of the first photo to be returned.
     * By default, all photos are returned.
     */
    private Integer offset;

    /**
     * Optional. Limits the number of photos to be retrieved.
     * Values between 1—100 are accepted. Defaults to 100.
     */
    private Integer limit;

    public GetUserProfilePhotos(String token, Long userId) {
        super(token);
        this.userId = userId;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference type() {
        return Types.USER_PHOTOS;
    }
}
