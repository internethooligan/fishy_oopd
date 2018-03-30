package nl.han.ica.mainVissie;

import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import processing.core.PApplet;

public abstract class Knop {
    protected GameEngine g;

    protected float x, y, breedte, hoogte;

    public Knop(GameEngine g, float x, float y, float breedte, float hoogte) {
        this.g = g;
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    public boolean isMuisOverKnop() {
        if (g.mouseX >= x && g.mouseX < x + breedte &&
                g.mouseY >= y && g.mouseY < y + hoogte) {
            return true;
        } else {
            return false;
        }
    }

    public abstract void tekenKnop();

    public void handelInteractieAf() {
        doeKnopActie();
    }

    public void doeKnopActie() {

    }
}

