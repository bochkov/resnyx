package resnyx.stickers;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object describes the position on faces where a mask should be placed by default.
 */
@Data
@NoArgsConstructor
public final class MaskPosition {

    /**
     * The part of the face relative to which the mask should be placed. One of “forehead”, “eyes”, “mouth”, or “chin”.
     */
    private MaskPoint point;

    /**
     * Shift by X-axis measured in widths of the mask scaled to the face size, from left to right.
     * For example, choosing -1.0 will place mask just to the left of the default mask position.
     */
    private Float xShift;

    /**
     * Shift by Y-axis measured in heights of the mask scaled to the face size, from top to bottom.
     * For example, 1.0 will place the mask just below the default mask position.
     */
    private Float yShift;

    /**
     * Mask scaling coefficient. For example, 2.0 means double size.
     */
    private Float scale;
}
