package nl.han.ica.mainVissie;

import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.View.EdgeFollowingViewport;
import nl.han.ica.OOPDProcessingEngineHAN.View.View;

public class Oceaan
{
//    public Sound achtergrondGeluid;
    private VisSpawner visSpawner;
    private Vis speler;
    private int worldWidth = 1920;
    private int worldHeight = 1080;
    protected GameEngine g;

    public Oceaan(GameEngine g)
    {
        this.g = g;
        maakSpelerAan(g);
        maakAiSpawnerAan();
    }

//    public void maakSoundAan()
//    {
//        achtergrondGeluid = new Sound();
//    }

    private void maakSpelerAan(GameEngine g)
    {
        speler = new Speler(this);

        // Spawn de speler op het midden van het speelveld
        g.addGameObject(speler, worldWidth/2, worldHeight/2);
    }

    public void createViewWithViewport(GameEngine g, int screenWidth, int screenHeight, float zoomFactor)
    {
        EdgeFollowingViewport viewPort = new EdgeFollowingViewport(speler, (int) Math.ceil(screenWidth / zoomFactor), (int) Math.ceil(screenHeight / zoomFactor), 0, 0);
        View view = new View(viewPort, worldWidth, worldHeight);
        g.setView(view);
        g.size(screenWidth, screenHeight);
        view.setBackground(g.loadImage("src/main/java/nl/han/ica/mainVissie/media/AchtergrondVissie.jpg"));
    }

    public void maakAiSpawnerAan()
    {
        visSpawner = new VisSpawner(g, 5, this);
    }
//
//    public void printScore(int score);
//    {
//
//    }


    public int getWorldWidth()
    {
        return worldWidth;
    }

    public int getWorldHeight()
    {
        return worldHeight;
    }
}
