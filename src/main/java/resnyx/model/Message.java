package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This object represents a message.
 */
@Data
@ToString(onlyExplicitlyIncluded = true)
public final class Message {

    /**
     * Unique message identifier inside this chat
     */
    @ToString.Include
    @JsonProperty("message_id")
    private Long id;

    /**
     * Optional. Sender, empty for messages sent to channels
     */
    private User from;

    /**
     * Date the message was sent in Unix time
     */
    private Date date;

    /**
     * Conversation the message belongs to
     */
    private Chat chat;

    /**
     * Optional. For forwarded messages, sender of the original message
     */
    @JsonProperty("forward_from")
    private User forwardFrom;

    /**
     * Optional. For messages forwarded from channels, information about the original channel
     */
    @JsonProperty("forward_from_chat")
    private Chat forwardFromChat;

    /**
     * Optional. For messages forwarded from channels, identifier of the original message in the channel
     */
    @JsonProperty("forward_from_message_id")
    private Long forwardFromMessage;

    /**
     * Optional. For messages forwarded from channels, signature of the post author if present
     */
    @JsonProperty("forward_signature")
    private String forwardSign;

    /**
     * Optional. Sender's name for messages forwarded from users who disallow adding a link to
     * their account in forwarded messages
     */
    @JsonProperty("forward_sender_name")
    private String forwardSender;

    /**
     * Optional. For forwarded messages, date the original message was sent in Unix time
     */
    @JsonProperty("forward_date")
    private Date forwardDate;

    /**
     * Optional. For replies, the original message. Note that the Message object in this
     * field will not contain further <i>reply_to_message</i> fields even if it itself is a reply.
     */
    @JsonProperty("reply_to_message")
    private Message replyTo;

    /**
     * Optional. Date the message was last edited in Unix time
     */
    @JsonProperty("edit_date")
    private Date editDate;

    /**
     * Optional. The unique identifier of a media message group this message belongs to
     */
    @JsonProperty("media_group_id")
    private String mediaGroup;

    /**
     * Optional. Signature of the post author for messages in channels
     */
    @JsonProperty("author_signature")
    private String authorSign;

    /**
     * Optional. For text messages, the actual UTF-8 text of the message, 0-4096 characters.
     */
    @ToString.Include
    private String text;

    /**
     * Optional. For text messages, special entities like usernames,
     * URLs, bot commands, etc. that appear in the text
     */
    private List<MessageEntity> entities = new ArrayList<>();

    /**
     * Optional. For messages with a caption, special entities like usernames,
     * URLs, bot commands, etc. that appear in the caption
     */
    @JsonProperty("caption_entities")
    private List<MessageEntity> captions;

    /**
     * Optional. Message is an audio file, information about the file
     */
    private Audio audio;

    /**
     * Optional. Message is a general file, information about the file
     */
    private Document document;

    /**
     * Optional. Message is an animation, information about the animation.
     * For backward compatibility, when this field is set, the <i>document</i> field will also be set
     */
    private Animation animation;

    /**
     * Optional. Message is a game, information about the game.
     * <a href="https://core.telegram.org/bots/api#games">More about games</a>
     */
    private Game game;

    /**
     * Optional. Message is a photo, available sizes of the photo
     */
    private List<PhotoSize> photo = new ArrayList<>();

    /**
     * Optional. Message is a sticker, information about the sticker
     */
    private Sticker sticker;

    /**
     * Optional. Message is a video, information about the video
     */
    private Video video;

    /**
     * Optional. Message is a voice message, information about the file
     */
    private Voice voice;

    /**
     * Optional. Message is a <a href="https://telegram.org/blog/video-messages-and-telescope">video note</a>,
     * information about the video message
     */
    @JsonProperty("video_note")
    private VideoNote videoNote;

    /**
     * Optional. Caption for the animation, audio, document, photo, video or voice, 0-1024 characters
     */
    private String caption;

    /**
     * Optional. Message is a shared contact, information about the contact
     */
    private Contact contact;

    /**
     * Optional. Message is a shared location, information about the location
     */
    private Location location;

    /**
     * Optional. Message is a venue, information about the venue
     */
    private Venue venue;

    /**
     * Optional. Message is a native poll, information about the poll
     */
    private Poll poll;

    /**
     * Optional. New members that were added to the group or supergroup and information about them
     * (the bot itself may be one of these members)
     */
    @JsonProperty("new_chat_members")
    private List<User> newMembers;

    /**
     * Optional. A member was removed from the group, information about them (this member may be the bot itself)
     */
    @JsonProperty("left_chat_member")
    private User leftUser;

    /**
     * Optional. A chat title was changed to this value
     */
    @JsonProperty("new_chat_title")
    private String newTitle;

    /**
     * Optional. A chat photo was change to this value
     */
    @JsonProperty("new_chat_photo")
    private List<PhotoSize> newPhoto;

    /**
     * Optional. Service message: the chat photo was deleted
     */
    @JsonProperty("delete_chat_photo")
    private Boolean deletePhoto;

    /**
     * Optional. Service message: the group has been created
     */
    @JsonProperty("group_chat_created")
    private Boolean groupCreated;

    /**
     * Optional. Service message: the supergroup has been created.
     * This field can‘t be received in a message coming through updates,
     * because bot can’t be a member of a supergroup when it is created.
     * It can only be found in reply_to_message if someone replies to a
     * very first message in a directly created supergroup.
     */
    @JsonProperty("supergroup_chat_created")
    private Boolean superGroupCreated;

    /**
     * Optional. Service message: the channel has been created.
     * This field can‘t be received in a message coming through updates,
     * because bot can’t be a member of a channel when it is created.
     * It can only be found in reply_to_message if someone replies to a very first message in a channel.
     */
    @JsonProperty("channel_chat_created")
    private Boolean channelChatCreated;

    /**
     * Optional. The group has been migrated to a supergroup with the specified identifier.
     * This number may be greater than 32 bits and some programming languages may have
     * difficulty/silent defects in interpreting it. But it is smaller than 52 bits,
     * so a signed 64 bit integer or double-precision float type are safe for storing this identifier.
     */
    @JsonProperty("migrate_to_chat_id")
    private Long migrateTo;

    /**
     * Optional. The supergroup has been migrated from a group with the specified identifier.
     * This number may be greater than 32 bits and some programming languages may have
     * difficulty/silent defects in interpreting it. But it is smaller than 52 bits,
     * so a signed 64 bit integer or double-precision float type are safe for storing this identifier.
     */
    @JsonProperty("migrate_from_chat_id")
    private Long migrateFrom;

    /**
     * Optional. Specified message was pinned. Note that the Message object in this
     * field will not contain further <i>reply_to_message</i> fields even if it is itself a reply.
     */
    @JsonProperty("pinned_message")
    private Message pinned;

    /**
     * Optional. Message is an invoice for a <a href="https://core.telegram.org/bots/api#payments">payment</a>,
     * information about the invoice.
     */
    private Invoice invoice;

    /**
     * Optional. Message is a service message about a successful payment, information about the payment.
     */
    @JsonProperty("successfulPayment")
    private SuccessfulPayment successPay;

    /**
     * Optional. The domain name of the website on which the user has logged in.
     * <a href="https://core.telegram.org/widgets/login">More about Telegram Login</a>
     */
    @JsonProperty("connected_website")
    private String webSite;

    /**
     * Optional. Telegram Passport data
     */
    @JsonProperty("passport_data")
    private PassportData passport;

    /**
     * Optional. Inline keyboard attached to the message. <code>login_url</code> buttons
     * are represented as ordinary <code>url</code> buttons.
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;
}
