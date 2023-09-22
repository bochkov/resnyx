package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "status", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "creator", value = ChatMemberOwner.class),
        @JsonSubTypes.Type(name = "administrator", value = ChatMemberAdministrator.class),
        @JsonSubTypes.Type(name = "member", value = ChatMemberMember.class),
        @JsonSubTypes.Type(name = "restricted", value = ChatMemberRestricted.class),
        @JsonSubTypes.Type(name = "left", value = ChatMemberLeft.class),
        @JsonSubTypes.Type(name = "kicked", value = ChatMemberBanned.class)
})
public interface ChatMember {
}
