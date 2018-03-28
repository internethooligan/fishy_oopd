package nl.han.ica.mainVissie;

import java.util.Random;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;

public class AI extends Vis {
    //
    private int grootte;
    private int richting;

    private final static int LINKS = 0;
    private final static int RECHTS = 1;



    public AI(int x, int y, Oceaan o, Sprite s, int frames) {
        super(x, y, o, s, frames);
        Random r = new Random();
        this.grootte = r.nextInt(50) + 1; // Returnt een waarde van 1 tot en met 50
        this.richting = r.nextInt(RECHTS + 1); // Return een waarde 0 of 1
    }

    @Override
    public void update() {
        if (getX() <= 0) {
            setxSpeed(0);
            setX(0);
        }
        if (getY() <= 0) {
            setySpeed(0);
            setY(0);
        }
        if (getX() >= super.oceaan.getWorldWidth() - grootte) {
            setxSpeed(0);
            setX(super.oceaan.getWorldWidth() - grootte);
        }
        if (getY() >= super.oceaan.getWorldHeight() - grootte) {
            setySpeed(0);
            setY(super.oceaan.getWorldHeight() - grootte);
        }

    }

}
