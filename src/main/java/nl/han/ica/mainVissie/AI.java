package nl.han.ica.mainVissie;

import java.util.Random;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;

public class AI extends Vis
{
    //
    private int grootte;
    private int richting;

    private final static int LINKS = 0;
    private final static int RECHTS = 1;


    public AI(Oceaan o)
    {
        super(o, new Sprite("src/main/java/nl/han/ica/mainVissie/media/AI.png"), 2);
        Random r = new Random();
        this.grootte = r.nextInt(50) + 1; // Returnt een waarde van 1 tot en met 50
        this.richting = r.nextInt(RECHTS + 1); // Return een waarde 0 of 1

        //Bepaal welke richting de AI op kijkt
        switch (richting)
        {
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

    public void beweeg(int richting)
    {
        switch (richting)
        {
            case LINKS:
                setxSpeed(-grootte/10f);
                break;
            case RECHTS:
                setxSpeed(grootte/10f);
        }
    }

    @Override
    public void update()
    {
        if (getX() <= 100)
        {
            super.g.deleteGameObject(this);
        }
        if (getY() <= 100)
        {
            super.g.deleteGameObject(this);
        }
    }
}
