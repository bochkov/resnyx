package resnyx.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import resnyx.messenger.general.ReplyParameters;
import resnyx.messenger.general.SuggestedPostParameters;
import resnyx.messenger.keyboard.ReplyMarkup;

@Data
public class SendOptions {

    /**
     * Unique identifier for the target message thread (topic) of the forum; for forum supergroups only
     */
    @JsonProperty("message_thread_id")
    private Long messageThreadId;

    /**
     * Sends the message silently. Users will receive a notification with no sound.
     */
    @JsonProperty("disable_notification")
    private Boolean disableNotification;

    /**
     * Protects the contents of the sent message from forwarding and saving
     */
    @JsonProperty("protect_content")
    private Boolean protectContent;

    /**
     * Pass True to allow up to 1000 messages per second, ignoring broadcasting
     * limits for a fee of 0.1 Telegram Stars per message.
     * The relevant Stars will be withdrawn from the bot's balance
     */
    @JsonProperty("allow_paid_broadcast")
    private Boolean allowPaidBroadcast;

    /**
     * Unique identifier of the message effect to be added to the message; for private chats only
     */
    @JsonProperty("message_effect_id")
    private String messageEffectId;

    /**
     * A JSON-serialized object containing the parameters of the suggested post to send; for direct messages chats only.
     * If the message is sent as a reply to another suggested post, then that suggested post is automatically declined.
     */
    @JsonProperty("suggested_post_parameters")
    private SuggestedPostParameters suggestedPostParameters;

    /**
     * Description of the message to reply to
     */
    @JsonProperty("reply_parameters")
    private ReplyParameters replyParameters;

    /**
     * A JSON-serialized object for an inline keyboard.
     * If empty, one 'Play game_title' button will be shown.
     * If not empty, the first button must launch the game.
     */
    @JsonProperty("reply_markup")
    private ReplyMarkup replyMarkup;
}
