package resnyx.messenger.chat;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to change the chosen reactions on a message.
 * Service messages can't be reacted to. Automatically forwarded messages from a channel to its discussion group
 * have the same available reactions as messages in the channel.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetMessageReaction implements TgMethod {

    /**
     * Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Identifier of the target message. If the message belongs to a media group,
     * the reaction is set to the first non-deleted message in the group instead.
     */
    @JsonProperty("message_id")
    private final Long messageId;

    /**
     * New list of reaction types to set on the message.
     * Currently, as non-premium users, bots can set up to one reaction per message.
     * A custom emoji reaction can be used if it is either already present
     * on the message or explicitly allowed by chat administrators.
     */
    private List<ReactionType> reaction;

    /**
     * Pass True to set the reaction with a big animation
     */
    @JsonProperty("is_big")
    private Boolean isBig;
}
