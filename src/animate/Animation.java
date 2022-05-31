package animate;

import paint.Fenster;

public abstract class Animation extends Fenster implements Runnable {

    public Animation(String title, int width, int height) {
        super(title, width, height);
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
         while(true) {
             // Warte 20 Millisekunden
             try {
                 Thread.sleep(20);
             } catch (InterruptedException e) {}
             // Fenster neu zeichnen
             repaint();
         }
    }

}
