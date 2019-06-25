package resnyx.methods.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.TgMethod;
import resnyx.Types;

/**
 * Use this method to restrict a user in a supergroup.
 * The bot must be an administrator in the supergroup for this to work and must have
 * the appropriate admin rights. Pass True for all boolean parameters to lift
 * restrictions from a user. Returns True on success.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class RestrictChatMember extends TgMethod<Boolean> {

    public static final String METHOD = "restrictChatMember";

    /**
     * Unique identifier for the target chat or username of the
     * target supergroup (in the format @supergroupusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Long userId;

    /**
     * Optional. Date when restrictions will be lifted for the user, unix time.
     * If user is restricted for more than 366 days or less than 30 seconds
     * from the current time, they are considered to be restricted forever
     */
    @JsonProperty("until_date")
    private Integer until;

    /**
     * Optional. Pass True, if the user can send text messages, contacts, locations and venues
     */
    @JsonProperty("can_send_messages")
    private Boolean sendMessages;

    /**
     * Optional. Pass True, if the user can send audios, documents, photos,
     * videos, video notes and voice notes, implies can_send_messages
     */
    @JsonProperty("can_send_media_messages")
    private Boolean sendMedia;

    /**
     * Optional. Pass True, if the user can send animations,
     * games, stickers and use inline bots, implies can_send_media_messages
     */
    @JsonProperty("can_send_other_messages")
    private Boolean sendOther;

    /**
     * Optional. Pass True, if the user may add web page previews to their messages,
     * implies can_send_media_messages
     */
    @JsonProperty("can_add_web_page_previews")
    private Boolean addWebPreview;

    public RestrictChatMember(String token, Long chatId, Long userId) {
        super(token);
        this.chatId = chatId;
        this.userId = userId;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference type() {
        return Types.BOOL;
    }
}
