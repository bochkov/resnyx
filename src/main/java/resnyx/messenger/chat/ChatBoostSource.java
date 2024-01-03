package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "source", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "premium", value = ChatBoostSourcePremium.class),
        @JsonSubTypes.Type(name = "gift_code", value = ChatBoostSourceGiftCode.class),
        @JsonSubTypes.Type(name = "giveaway", value = ChatBoostSourceGiveaway.class),
})
public interface ChatBoostSource {
}
