package paint;

import java.awt.event.MouseEvent;

public interface Editable {

    Paintable mouseReleased(MouseEvent e, DrawingPanel panel);
    Paintable mousePressed(MouseEvent e , DrawingPanel panel);
    Paintable mouseDragged(MouseEvent e , DrawingPanel panel);
    Paintable mouseMoved(MouseEvent e   , DrawingPanel panel);

}
