package nl.han.ica.mainVissie;

import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;

import processing.core.PApplet;

public class mainVissie extends GameEngine
{
    private Oceaan oceaan;
    public static void main(String[] args)
    {
        PApplet.main(new String[]{"nl.han.ica.mainVissie.mainVissie"});
    }

    @Override
    public void setupGame()
    {
        maakOceaanAan();
        oceaan.createViewWithViewport(this,1000, 800, 1.1f);
    }

    @Override
    public void update()
    {

    }

    private void maakOceaanAan()
    {
        oceaan = new Oceaan(this);
    }

    public void initializePersistence()
    {

    }

    public void verhoogScore()
    {
        // to-do (must)
    }

    public void maakMenuAan()
    {
        // to-do (should)
    }

    public void pauzeerSpel()
    {
        // to-do (could)
    }
}
