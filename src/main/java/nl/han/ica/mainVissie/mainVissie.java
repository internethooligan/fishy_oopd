package nl.han.ica.mainVissie;

import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileType;
import nl.han.ica.waterworld.tiles.BoardsTile;
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
        initializeTileMap();
        oceaan.createViewWithViewport(this,800, 800, 1.1f);
    }

    @Override
    public void update()
    {

    }

    public void maakOceaanAan()
    {
        oceaan = new Oceaan(this);
    }

    private void initializeTileMap()
    {
        /* TILES */
        Sprite boardsSprite = new Sprite("src/main/java/nl/han/ica/waterworld/media/boards.jpg");
        TileType<BoardsTile> boardTileType = new TileType<>(BoardsTile.class, boardsSprite);

        TileType[] tileTypes = {boardTileType};
        int tileSize = 50;
        int tilesMap[][] = {
                {0, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, 0, 0, 0, 0, -1, 0, 0},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1}
        };
        tileMap = new TileMap(tileSize, tileTypes, tilesMap);
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
