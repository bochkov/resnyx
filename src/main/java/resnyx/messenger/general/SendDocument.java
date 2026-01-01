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
 * Use this method to send general files. On success, the sent Message is returned.
 * Bots can currently send files of any type of up to 50 MB in size, this limit may be changed in the future.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendDocument implements TgMethod {

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
     * File to send. Pass a file_id as String to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL as a String for Telegram to get a file from the Internet, or upload a new one using multipart/form-data.
     */
    private final InputFile document;

    /**
     * Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     * The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail's width and height should not exceed 320.
     * Ignored if the file is not uploaded using multipart/form-data. Thumbnails can't be reused and can be only uploaded as a new file,
     * so you can pass “attach://<file_attach_name>” if the thumbnail was uploaded using multipart/form-data under <file_attach_name>
     */
    private InputFile thumbnail;

    @JsonUnwrapped
    private Caption caption;

    /**
     * Disables automatic server-side content type detection for files uploaded using multipart/form-data
     */
    @JsonProperty("disable_content_type_detection")
    private Boolean disableContentTypeDetection;

    @JsonUnwrapped
    private SendOptions sendOptions;
}
