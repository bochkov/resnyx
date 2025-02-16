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
 * Use this method to send video files, Telegram clients support MPEG4 videos (other formats may be sent as Document).
 * On success, the sent Message is returned.
 * Bots can currently send video files of up to 50 MB in size, this limit may be changed in the future.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendVideo implements TgMethod {

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
     * Video to send. Pass a file_id as String to send a video that exists on the Telegram servers (recommended),
     * pass an HTTP URL as a String for Telegram to get a video from the Internet, or upload a new video using multipart/form-data
     */
    private final InputFile video;

    /**
     * Duration of sent video in seconds
     */
    private Integer duration;

    /**
     * Video width
     */
    private Integer width;

    /**
     * Video height
     */
    private Integer height;

    /**
     * Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side. The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail's width and height should not exceed 320. Ignored if the file is not uploaded using multipart/form-data. Thumbnails can't be reused and can be only uploaded as a new file, so you can pass “attach://<file_attach_name>” if the thumbnail was uploaded using multipart/form-data under <file_attach_name>
     */
    private InputFile thumbnail;

    /**
     * Cover for the video in the message.
     * Pass a file_id to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL for Telegram to get a file from the Internet,
     * or pass “attach://<file_attach_name>” to upload a new one using multipart/form-data under <file_attach_name> name.
     */
    private InputFile cover;

    /**
     * Start timestamp for the video in the message
     */
    @JsonProperty("start_timestamp")
    private Integer startTimestamp;

    @JsonUnwrapped
    private Caption caption;

    /**
     * Pass True if the video needs to be covered with a spoiler animation
     */
    @JsonProperty("has_spoiler")
    private Boolean hasSpoiler;

    /**
     * Pass True if the uploaded video is suitable for streaming
     */
    @JsonProperty("supports_streaming")
    private Boolean supportsStreaming;

    @JsonUnwrapped
    private SendOptions sendOptions;
}
