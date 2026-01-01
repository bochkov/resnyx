package resnyx.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.InputFile;
import resnyx.common.SendOptions;

/**
 * Use this method to send static .WEBP, animated .TGS, or video .WEBM stickers.
 * On success, the sent Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendSticker implements TgMethod {

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
     * Sticker to send. Pass a file_id as String to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL as a String for Telegram to get a .WEBP sticker from the Internet,
     * or upload a new .WEBP or .TGS sticker using multipart/form-data.
     * Video stickers can only be sent by a file_id. Animated stickers can't be sent via an HTTP URL.
     */
    private final InputFile sticker;

    /**
     * Emoji associated with the sticker; only for just uploaded stickers
     */
    private String emoji;

    @JsonUnwrapped
    private SendOptions sendOptions;

}
