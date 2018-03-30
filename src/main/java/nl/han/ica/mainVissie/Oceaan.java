package nl.han.ica.mainVissie;

import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.View.EdgeFollowingViewport;
import nl.han.ica.OOPDProcessingEngineHAN.View.View;
import nl.han.ica.OOPDProcessingEngineHAN.Sound.Sound;

public class Oceaan
{
    private tekstObject score;
    public Sound achtergrondGeluid;
    private VisSpawner visSpawner;
    private Vis speler;
    private int worldWidth = 1920;
    private int worldHeight = 1080;
    protected GameEngine g;
    private Menu menu;
    private AI ai = new AI(this);

    public Oceaan(GameEngine g)
    {
        this.g = g;
        maakMenuAan();
        menu.addGameObject(ai);
        //maakSpelerAan(g);
        //maakAiSpawnerAan();
        //maakSoundAan();
    }

    private void printScore()
    {
        score.setTekst("Score: " + (speler.getGrootte() - 48) * 100);
    }

    private void maakMenuAan(){
        menu = new Menu();
    }

    private void maakSoundAan()
    {
        achtergrondGeluid = new Sound(g, "src/main/java/nl/han/ica/mainVissie/media/background.mp3");
        achtergrondGeluid.loop(-1);
    }

    private void maakSpelerAan(GameEngine g)
    {
        speler = new Speler(this);

        // Spawn de speler op het midden van het speelveld
        g.addGameObject(speler, worldWidth / 2, worldHeight / 2);
    }

    public void createViewWithViewport(GameEngine g, int screenWidth, int screenHeight, float zoomFactor)
    {
        EdgeFollowingViewport viewPort = new EdgeFollowingViewport(speler, (int) Math.ceil(screenWidth / zoomFactor), (int) Math.ceil(screenHeight / zoomFactor), 0, 0);
        View view = new View(viewPort, worldWidth, worldHeight);
        g.setView(view);
        g.size(screenWidth, screenHeight);
        view.setBackground(g.loadImage("src/main/java/nl/han/ica/mainVissie/media/AchtergrondVissie.jpg"));
    }

    public void createViewWithoutViewport(GameEngine g, int screenWidth, int screenHeight) {
        View view = new View(screenWidth,screenHeight);
        view.setBackground(g.loadImage("src/main/java/nl/han/ica/mainVissie/media/AchtergrondVissie1000x800.jpg"));

        g.setView(view);
        g.size(screenWidth, screenHeight);
    }

    public void maakAiSpawnerAan()
    {
        visSpawner = new VisSpawner(g, 1, this);
    }

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