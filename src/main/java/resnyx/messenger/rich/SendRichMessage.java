package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.SendOptions;

/**
 * Use this method to send rich messages.
 * If the message contains a block with a media element, then the bot must have the right to send the media to the chat.
 * On success, the sent Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendRichMessage implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which the message will be sent.
     * Bot can send rich messages on behalf of a business account only if the corresponding user can send rich messages.
     */
    @JsonProperty("business_connection_id")
    private String businessConnectionId;

    /**
     * Unique identifier for the target chat or username of the target bot, supergroup or channel in the format @username
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Identifier of the direct messages topic to which the message will be sent;
     * required if the message is sent to a direct messages chat
     */
    @JsonProperty("direct_messages_topic_id")
    private Integer directMessagesTopicId;

    /**
     * The message to be sent
     */
    @JsonProperty("rich_message")
    private final InputRichMessage richMessage;

    @JsonUnwrapped
    private SendOptions sendOptions;
}
