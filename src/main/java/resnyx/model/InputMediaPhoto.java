package resnyx.model;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * Represents a photo to be sent.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public final class InputMediaPhoto extends InputMedia {

    public InputMediaPhoto() {
        this.type = "photo";
    }
}
