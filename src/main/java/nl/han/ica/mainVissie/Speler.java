package nl.han.ica.mainVissie;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Sound.Sound;

/**
 * Klasse speler waarin de vis geprogrammeerd wordt die kan worden bestuurd
 */
public class Speler extends Vis
{
    private int grootte = 48;
    private final Sound hapGeluid;

    Speler(Oceaan o)
    {
        super(o, new Sprite("src/main/java/nl/han/ica/mainVissie/media/speler.png"), 4);
        hapGeluid = new Sound(o.g,"src/main/java/nl/han/ica/mainVissie/media/hap.mp3");

        // Aangeven welke sprite er als het programma start moet worden weergegeven
        setCurrentFrameIndex(1);

        // Hoe ver de speler beweegt in 1 "move"
        setFriction(0.05f);
    }

    /**
     * Maakt de speler grootte met de meegegeven waarde.
     * @param waarde: deze waarde staat voor hoe veel groter de speler moet worden.
     */

    public void maakGroter(int waarde)
    {
        grootte += waarde;
        super.s.resize(grootte, grootte);
        setFrameWidth(grootte / 4); // setter gemaakt in AnimatedSpriteObject uit GameEngine
    }

    public void speelHapGeluid(){
        hapGeluid.rewind();
        hapGeluid.play();
    }

    @Override

    public void update()
    {
        if (getX() <= 0)
        {
            setxSpeed(0);
            setX(0);
        }
        if (getY() <= 0)
        {
            setySpeed(0);
            setY(0);
        }
        if (getX() >= super.oceaan.getWorldWidth() - grootte)
        {
            setxSpeed(0);
            setX(super.oceaan.getWorldWidth() - grootte);
        }
        if (getY() >= super.oceaan.getWorldHeight() - grootte)
        {
            setySpeed(0);
            setY(super.oceaan.getWorldHeight() - grootte);
        }
    }

    @Override
    public void keyPressed(int keyCode, char key)
    {
        final int speed = 5;
        if (keyCode == super.g.LEFT)
        {
            setDirectionSpeed(270, speed);
            setCurrentFrameIndex(0);
        }
        if (keyCode == super.g.UP)
        {
            setDirectionSpeed(0, speed);
            setCurrentFrameIndex(2);
        }
        if (keyCode == super.g.RIGHT)
        {
            setDirectionSpeed(90, speed);
            setCurrentFrameIndex(1);
        }
        if (keyCode == super.g.DOWN)
        {
            setDirectionSpeed(180, speed);
            setCurrentFrameIndex(3);
        }
    }

    public int getGrootte() {
        return grootte;
    }
}
