package nl.han.ica.mainVissie;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import processing.core.PGraphics;

public class tekstObject extends GameObject
{
    private String tekst;

    public tekstObject(String tekst)
    {
        this.tekst = tekst;
    }

    public void setTekst(String tekst)
    {
        this.tekst = tekst;
    }

    @Override
    public void update()
    {

    }

    @Override
    public void draw(PGraphics g)
    {
        g.textAlign(g.LEFT, g.TOP);
        g.textSize(50);
        g.text(tekst, getX(), getY());
    }
}
