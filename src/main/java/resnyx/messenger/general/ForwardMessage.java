package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to forward messages of any kind.
 * Service messages can't be forwarded.
 * On success, the sent Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class ForwardMessage implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Unique identifier for the target message thread (topic) of a forum;
     * for forum supergroups and private chats of bots with forum topic mode enabled only
     */
    @JsonProperty("message_thread_id")
    private Long messageThreadId;

    /**
     * Identifier of the direct messages topic to which the message will be sent;
     * required if the message is sent to a direct messages chat
     */
    @JsonProperty("direct_messages_topic_id")
    private Integer directMessagesTopicId;

    /**
     * Unique identifier for the chat where the original message was sent (or channel username in the format @channelusername)
     */
    @JsonProperty("from_chat_id")
    private final String fromChatId;

    /**
     * New start timestamp for the forwarded video in the message
     */
    @JsonProperty("video_start_timestamp")
    private Integer videoStartTimestamp;

    /**
     * Sends the message silently. Users will receive a notification with no sound.
     */
    @JsonProperty("disable_notification")
    private Boolean disableNotification;

    /**
     * Protects the contents of the forwarded message from forwarding and saving
     */
    @JsonProperty("protect_content")
    private Boolean protectContent;

    /**
     * Unique identifier of the message effect to be added to the message;
     * only available when forwarding to private chats
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
     * Message identifier in the chat specified in from_chat_id
     */
    @JsonProperty("message_id")
    private Long messageId;
}
