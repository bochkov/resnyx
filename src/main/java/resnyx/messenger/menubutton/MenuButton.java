package resnyx.messenger.menubutton;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = MenuButtonCommands.class, name = "commands"),
        @JsonSubTypes.Type(value = MenuButtonWebApp.class, name = "web_app"),
        @JsonSubTypes.Type(value = MenuButtonDefault.class, name = "default")
})
public interface MenuButton {
}
