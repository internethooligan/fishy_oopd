package nl.han.ica.mainVissie;

import nl.han.ica.OOPDProcessingEngineHAN.Collision.ICollidableWithGameObjects;
import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.AnimatedSpriteObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;


import java.util.List;

public abstract class Vis extends AnimatedSpriteObject implements ICollidableWithGameObjects {
    protected Oceaan oceaan;
    protected GameEngine g;

    Vis(Oceaan o, Sprite s, int frames){
        super(s, frames);
        //xPos = x;
        //yPos = y;
        oceaan = o;
        g = oceaan.g;
    }


    @Override
    public void gameObjectCollisionOccurred(List<GameObject> collidedGameObjects)
    {

    }

    @Override
    public void update() {

    }
}
