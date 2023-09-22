package resnyx.updates;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.inline.ChosenInlineResult;
import resnyx.inline.InlineQuery;
import resnyx.messenger.chat.ChatJoinRequest;
import resnyx.messenger.chat.ChatMemberUpdated;
import resnyx.messenger.general.Message;
import resnyx.messenger.general.Poll;
import resnyx.messenger.general.PollAnswer;
import resnyx.messenger.keyboard.CallbackQuery;
import resnyx.payments.PreCheckoutQuery;
import resnyx.payments.ShippingQuery;

/**
 * This object represents an incoming update.
 * At most one of the optional parameters can be present in any given update.
 */
@Data
@NoArgsConstructor
public final class Update {

    /**
     * The update's unique identifier.
     * Update identifiers start from a certain positive number and increase sequentially.
     * This ID becomes especially handy if you're using webhooks, since it allows you to ignore repeated updates or to restore the correct update sequence, should they get out of order.
     * If there are no new updates for at least a week, then identifier of the next update will be chosen randomly instead of sequentially.
     */
    @JsonProperty("update_id")
    private Long updateId;

    /**
     * Optional. New incoming message of any kind - text, photo, sticker, etc.
     */
    private Message message;

    /**
     * Optional. New version of a message that is known to the bot and was edited
     */
    @JsonProperty("edited_message")
    private Message editedMessage;

    /**
     * Optional. New incoming channel post of any kind - text, photo, sticker, etc.
     */
    @JsonProperty("channel_post")
    private Message channelPost;

    /**
     * Optional. New version of a channel post that is known to the bot and was edited
     */
    @JsonProperty("edited_channel_post")
    private Message editedChannelPost;

    /**
     * Optional. New incoming inline query
     */
    @JsonProperty("inline_query")
    private InlineQuery inlineQuery;

    /**
     * Optional. The result of an inline query that was chosen by a user and sent to their chat partner.
     * Please see documentation on the feedback collecting for details on how to enable these updates for your bot.
     */
    @JsonProperty("chosen_inline_result")
    private ChosenInlineResult chosenInlineResult;

    /**
     * Optional. New incoming callback query
     */
    @JsonProperty("callback_query")
    private CallbackQuery callbackQuery;

    /**
     * Optional. New incoming shipping query. Only for invoices with flexible price
     */
    @JsonProperty("shipping_query")
    private ShippingQuery shippingQuery;

    /**
     * Optional. New incoming pre-checkout query. Contains full information about checkout
     */
    @JsonProperty("pre_checkout_query")
    private PreCheckoutQuery preCheckoutQuery;

    /**
     * Optional. New poll state. Bots receive only updates about stopped polls and polls, which are sent by the bot
     */
    private Poll poll;

    /**
     * Optional. A user changed their answer in a non-anonymous poll.
     * Bots receive new votes only in polls that were sent by the bot itself.
     */
    @JsonProperty("poll_answer")
    private PollAnswer pollAnswer;

    /**
     * Optional. The bot's chat member status was updated in a chat.
     * For private chats, this update is received only when the bot is blocked or unblocked by the user.
     */
    @JsonProperty("my_chat_member")
    private ChatMemberUpdated myChatMember;

    /**
     * Optional. A chat member's status was updated in a chat.
     * The bot must be an administrator in the chat and must explicitly specify “chat_member” in the list of allowed_updates to receive these updates.
     */
    @JsonProperty("chat_member")
    private ChatMemberUpdated chatMember;

    /**
     * Optional. A request to join the chat has been sent.
     * The bot must have the can_invite_users administrator right in the chat to receive these updates.
     */
    @JsonProperty("chat_join_request")
    private ChatJoinRequest chatJoinRequest;

}
