package resnyx.messenger.business;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.messenger.general.InputProfilePhoto;

/**
 * Changes the profile photo of a managed business account.
 * Requires the <i>can_edit_profile_photo</i> business bot right.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetBusinessAccountProfilePhoto implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which to read the message
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;

    /**
     * The new profile photo to set
     */
    private final InputProfilePhoto photo;

    /**
     * Pass True to set the public photo, which will be visible even if the main photo is hidden by the business account's privacy settings.
     * An account can have only one public photo.
     */
    @JsonProperty("is_public")
    private Boolean isPublic;
}
