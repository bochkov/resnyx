package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to revoke an invite link created by the bot.
 * If the primary link is revoked, a new link is automatically generated.
 * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
 * Returns the revoked invite link as {@link ChatInviteLink} object.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class RevokeChatSubscriptionInviteLink implements TgMethod {

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

}
