package nl.han.ica.mainVissie;

import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Sound.Sound;

public class Speler extends Vis {
    static int grootte = 25;

    Speler(Oceaan o) {
        super((o.getWorldWidth()/2), (o.getWorldHeight()/2), o, new Sprite("src/main/java/nl/han/ica/mainVissie/media/fish.png"), 96);
    }

    @Override
    public void update() {
        if (getX()<=0) {
            setxSpeed(0);
            setX(0);
        }
        if (getY()<=0) {
            setySpeed(0);
            setY(0);
        }
        if (getX()>=super.oceaan.getWorldWidth() - grootte) {
            setxSpeed(0);
            setX(super.oceaan.getWorldWidth() - grootte);
        }
        if (getY()>=super.oceaan.getWorldHeight() - grootte) {
            setySpeed(0);
            setY(super.oceaan.getWorldHeight() - grootte);
        }

    }

    @Override
    public void keyPressed(int keyCode, char key) {
        final int speed = 5;
        if (keyCode == super.oceaan.LEFT) {
            setDirectionSpeed(270, speed);
            setCurrentFrameIndex(0);
        }
        if (keyCode == super.oceaan.UP) {
            setDirectionSpeed(0, speed);
        }
        if (keyCode == super.oceaan.RIGHT) {
            setDirectionSpeed(90, speed);
            setCurrentFrameIndex(1);
        }
        if (keyCode == super.oceaan.DOWN) {
            setDirectionSpeed(180, speed);
        }
        if (key == ' ') {
            System.out.println("Spatie!");
        }
}
