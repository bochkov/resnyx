package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to get a list of profile audios for a user. Returns a UserProfileAudios object.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetUserProfileAudios implements TgMethod {

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * Sequential number of the first audio to be returned. By default, all audios are returned.
     */
    private Integer offset;

    /**
     * Limits the number of audios to be retrieved. Values between 1-100 are accepted. Defaults to 100.
     */
    private Integer limit;

}
