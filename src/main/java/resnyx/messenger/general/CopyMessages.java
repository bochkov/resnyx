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
 * Use this method to copy messages of any kind. If some of the specified messages can't be found or copied, they are skipped.
 * Service messages, giveaway messages, giveaway winners messages, and invoice messages can't be copied.
 * A quiz poll can be copied only if the value of the field correct_option_id is known to the bot.
 * The method is analogous to the method forwardMessages, but the copied messages don't have a link to the original message.
 * Album grouping is kept for copied messages.
 * On success, an array of MessageId of the sent messages is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class CopyMessages implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
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
     * Unique identifier for the chat where the original message was sent (or channel username in the format @channelusername)
     */
    @JsonProperty("from_chat_id")
    private final String fromChatId;

    /**
     * Identifiers of 1-100 messages in the chat from_chat_id to copy.
     * The identifiers must be specified in a strictly increasing order.
     */
    @JsonProperty("message_ids")
    private final List<Long> messageIds;

    @JsonUnwrapped
    private Caption caption;

    @JsonUnwrapped
    private SendOptions sendOptions;
}
