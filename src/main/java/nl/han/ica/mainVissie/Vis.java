package nl.han.ica.mainVissie;

import nl.han.ica.OOPDProcessingEngineHAN.Collision.ICollidableWithGameObjects;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.AnimatedSpriteObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.GameObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;


import java.util.List;

public class Vis extends AnimatedSpriteObject implements ICollidableWithGameObjects {
    protected int xPos, yPos;
    protected Oceaan oceaan;

    Vis(int x, int y, Oceaan o, Sprite s, int frames){
        super(s, frames);
        xPos = x;
        yPos = y;
        oceaan = o;
    }


    @Override
    public void gameObjectCollisionOccurred(List<GameObject> collidedGameObjects) {

    }

    @Override
    public void update() {

    }
}
