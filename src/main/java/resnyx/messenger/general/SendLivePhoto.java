package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.Caption;
import resnyx.common.InputFile;
import resnyx.common.SendOptions;

/**
 * Use this method to send live photos. On success, the sent Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendLivePhoto implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which the message will be sent
     */
    @JsonProperty("business_connection_id")
    private String businessConnectionId;

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
     * For outgoing ephemeral messages, unique identifier of the user who will receive the message;
     * for group and supergroup chats only. It is not guaranteed that the user will receive the message,
     * especially if they are offline. See ephemeral message sending for more details.
     */
    @JsonProperty("receiver_user_id")
    private Long receiverUserId;

    /**
     * For outgoing ephemeral messages, identifier of the callback query which triggered the message if any
     */
    @JsonProperty("callback_query_id")
    private String callbackQueryId;

    /**
     * Live photo video to send. The video must be no longer than 10 seconds and must not exceed 10 MB in size.
     * Pass a file_id as String to send a video that exists on the Telegram servers (recommended)
     * or upload a new video using multipart/form-data.
     * Sending live photos by a URL is currently unsupported.
     */
    @JsonProperty("live_photo")
    private final InputFile livePhoto;

    /**
     * The static photo to send. Pass a file_id as String to send a photo that exists on the
     * Telegram servers (recommended) or upload a new video using multipart/form-data.
     * Sending live photos by a URL is currently unsupported.
     */
    private final InputFile photo;

    @JsonUnwrapped
    private Caption caption;

    /**
     * Pass True if the video needs to be covered with a spoiler animation
     */
    @JsonProperty("has_spoiler")
    private Boolean hasSpoiler;

    @JsonUnwrapped
    private SendOptions sendOptions;

}
