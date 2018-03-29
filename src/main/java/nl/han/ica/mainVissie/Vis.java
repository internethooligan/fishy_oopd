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
    protected Sprite s;
    protected int grootte;

    Vis(Oceaan o, Sprite s, int frames) {
        super(s, frames);
        //xPos = x;
        //yPos = y;
        oceaan = o;
        g = oceaan.g;
        this.s = s;
    }

    /**
     * Check of speler groter is dan de 'collided' AI en verwijder dan het kleinste object.
     * Als speler kleiner is dan het object dan zal de speler worden opgegeten en het spel worden gestopt.
     * @param collidedGameObjects
     */
    @Override
    public void gameObjectCollisionOccurred(List<GameObject> collidedGameObjects) {
        for (GameObject go:collidedGameObjects) {
            if (this instanceof Speler && go instanceof AI) {
                if(((Speler) this).getGrootte() > ((AI) go).getGrootte()){
                    g.deleteGameObject(go);
                } else if (((Speler) this).getGrootte() < ((AI) go).getGrootte()){
                    g.deleteGameObject(this);
                }
                /*popSound.rewind();
                popSound.play();
                world.deleteGameObject(this);
                world.increaseBubblesPopped();*/
            }
        }
    }

    @Override
    public void update() {
    }
}
