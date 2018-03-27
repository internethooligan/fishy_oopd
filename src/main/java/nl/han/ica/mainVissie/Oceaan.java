package nl.han.ica.mainVissie;

import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.View.EdgeFollowingViewport;
import nl.han.ica.OOPDProcessingEngineHAN.View.View;

public class Oceaan
{
//    public Sound achtergrondGeluid;
//    public VisSpawner visSpawner;
    private Vis speler;
    private int worldWidth = 1204;
    private int worldHeight = 903;
    protected GameEngine a;

    public Oceaan(GameEngine g)
    {
        maakSpelerAan(g);
        a = g;
    }

//    public void maakSoundAan()
//    {
//        achtergrondGeluid = new Sound();
//    }

    public void maakSpelerAan(GameEngine g)
    {
        speler = new Speler(this);
        g.addGameObject(speler, 100, 100);
    }

    public void createViewWithViewport(GameEngine g, int screenWidth, int screenHeight, float zoomFactor)
    {
        EdgeFollowingViewport viewPort = new EdgeFollowingViewport(speler, (int) Math.ceil(screenWidth / zoomFactor), (int) Math.ceil(screenHeight / zoomFactor), 0, 0);
        viewPort.setTolerance(50, 50, 50, 50);
        View view = new View(viewPort, worldWidth, worldHeight);
        g.setView(view);
        g.size(screenWidth, screenHeight);
        view.setBackground(g.loadImage("src/main/java/nl/han/ica/waterworld/media/background.jpg"));
    }

//    public void maakAiSpawnerAan()
//    {
//        visSpawner = new VisSpawner();
//    }
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
