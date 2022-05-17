package paint;

import java.awt.*;

public interface Selectable {

    /**
     * Prüft ob der Punkt point direkt auf dem Objekt liegt
     * @param point Punkt
     * @return      true wenn Element selektiert
     */
    boolean isSelected(Point point);

    /**
     * Misst den Abstand eines Punkte von einem Element
     * @param point Punkt
     * @return      Abstand des Punktes vom Element
     */
    double distanceTo(Point point);

}
