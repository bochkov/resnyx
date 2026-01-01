package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.Caption;
import resnyx.common.SendOptions;

import java.util.List;

/**
 * Use this method to send paid media to channel chats. On success, the sent {@link Message} is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendPaidMedia implements TgMethod {

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
     * The number of Telegram Stars that must be paid to buy access to the media
     */
    @JsonProperty("star_counter")
    private final Integer starCounter;

    /**
     * A JSON-serialized array describing the media to be sent; up to 10 items
     */
    private final List<InputPaidMedia> media;

    /**
     * Bot-defined paid media payload, 0-128 bytes. This will not be displayed to the user, use it for your internal processes.
     */
    private String payload;

    @JsonUnwrapped
    private Caption caption;

    @JsonUnwrapped
    private SendOptions sendOptions;
}
