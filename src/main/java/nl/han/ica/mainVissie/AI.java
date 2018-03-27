package nl.han.ica.mainVissie;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;

public class AI extends Vis {
    private int grootte;
    private boolean richting; //Rechts = true



    AI(int x, int y, Oceaan o, Sprite s, int frames) {
        super(x, y, o, s, frames);
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
