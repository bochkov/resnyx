package resnyx.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents the content of a media message to be sent. It should be one of
 * <ul>
 * <li>{@link InputMediaAnimation}</li>
 * <li>{@link InputMediaDocument}</li>
 * <li>{@link InputMediaAudio}</li>
 * <li>{@link InputMediaPhoto}</li>
 * <li>{@link InputMediaVideo}</li>
 * </ul>
 */
public abstract class InputMedia implements Serializable  {

    /**
     * Type of the result
     */
    protected String type;

    /**
     * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL for Telegram to get a file from the Internet, or pass
     * “attach://<file_attach_name>” to upload a new one using multipart/form-data under <file_attach_name> name.
     * <a href="https://core.telegram.org/bots/api#sending-files">More info on Sending Files</a>
     */
    protected String media;

    /**
     * Optional. Caption of the photo to be sent, 0-1024 characters
     */
    protected String caption;

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    @JsonProperty("parse_mode")
    protected String parseMode;
}
