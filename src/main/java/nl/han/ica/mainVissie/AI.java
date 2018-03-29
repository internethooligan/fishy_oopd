package nl.han.ica.mainVissie;

import java.util.Random;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;

public class AI extends Vis {
    private int grootte;
    private int richting;
    private int snelheid;

    private final static int LINKS = 0;
    private final static int RECHTS = 1;


    public AI(Oceaan o) {
        super(o, new Sprite("src/main/java/nl/han/ica/mainVissie/media/AI.png"), 2);
        Random r = new Random();
        this.grootte = r.nextInt(150) + 1; // Returned een waarde van 1 tot en met 50
        this.snelheid = r.nextInt(5) + 1; // Returned een waarde van 1 tot en met 5
        this.richting = r.nextInt(RECHTS + 1); // Returned een waarde 0 of 1

        super.s.resize(grootte, grootte);
        //Bepaal welke richting de AI op kijkt
        switch (richting) {
            case LINKS:
                setCurrentFrameIndex(0);
                break;
            case RECHTS:
                setCurrentFrameIndex(1);
                break;
            default:
                break;
        }
        beweeg(richting);
    }

    public void beweeg(int richting) {
        switch (richting) {
            case LINKS:
                setxSpeed(-snelheid);
                break;
            case RECHTS:
                setxSpeed(snelheid);
                break;
        }
    }

    @Override
    public void update() {
        if (getX() <= 10 || getX() >= oceaan.getWorldWidth()) {
            super.g.deleteGameObject(this);
        }
    }

    public int getRichting() {
        return richting;
    }

    public int getGrootte() {
        return grootte;
    }
}