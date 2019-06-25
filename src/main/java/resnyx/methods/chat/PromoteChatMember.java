package resnyx.methods.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.TgMethod;
import resnyx.Types;

/**
 * Use this method to promote or demote a user in a supergroup or a channel.
 * The bot must be an administrator in the chat for this to work and must
 * have the appropriate admin rights. Pass False for all boolean parameters to demote a user.
 * Returns True on success.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class PromoteChatMember extends TgMethod<Boolean> {

    public static final String METHOD = "promoteChatMember";

    /**
     * Unique identifier for the target chat or username of the
     * target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Long userId;

    /**
     * Optional. Pass True, if the administrator can change chat title, photo and other settings
     */
    @JsonProperty("can_change_info")
    private Boolean changeInfo;

    /**
     * Optional. Pass True, if the administrator can create channel posts, channels only
     */
    @JsonProperty("can_post_messages")
    private Boolean postMessages;

    /**
     * Optional. Pass True, if the administrator can edit messages of
     * other users and can pin messages, channels only
     */
    @JsonProperty("can_edit_messages")
    private Boolean editMessages;

    /**
     * Optional. Pass True, if the administrator can delete messages of other users
     */
    @JsonProperty("can_delete_messages")
    private Boolean deleteMessages;

    /**
     * Optional. Pass True, if the administrator can invite new users to the chat
     */
    @JsonProperty("can_invite_users")
    private Boolean invateUsers;

    /**
     * Optional. Pass True, if the administrator can restrict, ban or unban chat members
     */
    @JsonProperty("can_restrict_members")
    private Boolean restrictMembers;

    /**
     * Optional. Pass True, if the administrator can pin messages, supergroups only
     */
    @JsonProperty("can_pin_messages")
    private Boolean pinMessages;

    /**
     * Optional. Pass True, if the administrator can add new administrators with a
     * subset of his own privileges or demote administrators that he has promoted,
     * directly or indirectly (promoted by administrators that were appointed by him)
     */
    @JsonProperty("can_promote_members")
    private Boolean promoteMembers;

    public PromoteChatMember(String token, Long chatId, Long userId) {
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


