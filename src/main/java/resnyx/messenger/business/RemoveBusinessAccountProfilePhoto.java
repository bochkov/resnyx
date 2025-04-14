package resnyx.messenger.business;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Removes the current profile photo of a managed business account.
 * Requires the <i>can_edit_profile_photo</i> business bot right.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class RemoveBusinessAccountProfilePhoto implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which to read the message
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;

    /**
     * Pass True to remove the public photo, which is visible even if the main photo is hidden by the business account's privacy settings.
     * After the main photo is removed, the previous profile photo (if present) becomes the main photo.
     */
    @JsonProperty("is_public")
    private Boolean isPublic;

}
