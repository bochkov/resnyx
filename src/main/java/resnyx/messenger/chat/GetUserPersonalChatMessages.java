package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to get the last messages from the personal chat
 * (i.e., the chat currently added to their profile) of a given user.
 * On success, an array of Message objects is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetUserPersonalChatMessages implements TgMethod {

    /**
     * Unique identifier for the target user
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * The maximum number of messages to return; 1-20
     */
    private final Integer limit;
}
