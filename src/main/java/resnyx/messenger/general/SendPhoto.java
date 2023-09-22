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

@Getter
@Setter
@RequiredArgsConstructor
public final class SendPhoto implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Photo to send. Pass a file_id as String to send a photo that exists on the Telegram servers (recommended),
     * pass an HTTP URL as a String for Telegram to get a photo from the Internet, or upload a new photo using multipart/form-data.
     * The photo must be at most 10 MB in size. The photo's width and height must not exceed 10000 in total.
     * Width and height ratio must be at most 20.
     */
    private final InputFile photo;

    @JsonUnwrapped
    private Caption caption;

    /**
     * Pass True if the photo needs to be covered with a spoiler animation
     */
    @JsonProperty("has_spoiler")
    private Boolean hasSpoiler;

    @JsonUnwrapped
    private SendOptions sendOptions;
}
