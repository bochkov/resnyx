package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represents an incoming update.<br>
 * At most one of the optional parameters can be present in any given update.
 */
@Data
public final class Update {

    /**
     * The update‘s unique identifier. Update identifiers start from a certain positive
     * number and increase sequentially. This ID becomes especially handy if you’re using
     * <a href="https://core.telegram.org/bots/api#setwebhook">Webhooks</a>,
     * since it allows you to ignore repeated updates or to restore the correct
     * update sequence, should they get out of order. If there are no new updates for at
     * least a week, then identifier of the next update will be chosen randomly instead of sequentially.
     */
    @JsonProperty("update_id")
    private Integer id;

    /**
     * Optional. New incoming message of any kind — text, photo, sticker, etc.
     */
    private Message message;

    /**
     * Optional. New version of a message that is known to the bot and was edited
     */
    @JsonProperty("edited_message")
    private Message editedMessage;

    /**
     * Optional. New incoming channel post of any kind — text, photo, sticker, etc.
     */
    @JsonProperty("channel_post")
    private Message channelPost;

    /**
     * Optional. New version of a channel post that is known to the bot and was edited
     */
    @JsonProperty("edited_message_post")
    private Message editedChannelPost;

    /**
     * Optional. New incoming inline query
     */
    @JsonProperty("inline_query")
    private InlineQuery inlineQuery;

    /**
     * Optional. The result of an inline query that was chosen by a user and sent to their chat partner.
     * Please see our documentation on the
     * <a href="https://core.telegram.org/bots/inline#collecting-feedback">feedback collecting</a>
     * for details on how to enable these updates for your bot.
     */
    @JsonProperty("chosen_inline_result")
    private ChosenInlineResult inlineResult;

    /**
     * Optional. New incoming callback query
     */
    @JsonProperty("callback_query")
    private CallbackQuery callback;

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
}
