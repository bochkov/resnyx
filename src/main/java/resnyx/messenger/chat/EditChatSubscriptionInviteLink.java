package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to edit a subscription invite link created by the bot.
 * The bot must have the <i>can_invite_users</i> administrator rights.
 * Returns the edited invite link as a {@link ChatInviteLink} object.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class EditChatSubscriptionInviteLink implements TgMethod {

    /**
     * Unique identifier for the target channel chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * The invite link to edit
     */
    @JsonProperty("invite_link")
    private final String inviteLink;

    /**
     * Invite link name; 0-32 characters
     */
    private String name;

}
