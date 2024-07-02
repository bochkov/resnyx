package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * The paid media is a photo.
 */
@Data
@NoArgsConstructor
public final class PaidMediaPhoto implements PaidMedia {

    /**
     * Type of the paid media, always “photo”
     */
    private String type;

    /**
     * The photo
     */
    private List<PhotoSize> photo;
}
