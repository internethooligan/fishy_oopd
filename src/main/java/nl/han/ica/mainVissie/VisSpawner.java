package nl.han.ica.mainVissie;

import nl.han.ica.OOPDProcessingEngineHAN.Alarm.Alarm;
import nl.han.ica.OOPDProcessingEngineHAN.Alarm.IAlarmListener;
import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;

import java.util.Random;

/**
 * Deze klasse zorg er voor dat er andere vissen in het water worden gespawned
 *
 * @author harry & de boiii
 */
public class VisSpawner implements IAlarmListener
{
    private Random random;
    private Oceaan oceaan;
    private float vissenPerSeconde;
    private GameEngine g;

    VisSpawner(GameEngine g, float vissenPerSeconde, Oceaan oceaan)
    {
        this.vissenPerSeconde = vissenPerSeconde;
        this.oceaan = oceaan;
        this.g = g;

        random = new Random();
        startAlarm();
    }

    private void startAlarm()
    {
        Alarm alarm = new Alarm("Nieuwe vis", 1 / vissenPerSeconde);
        alarm.addTarget(this);
        alarm.start();
    }


    @Override
    public void triggerAlarm(String alarmName)
    {
        Vis ai = new AI(oceaan);
        g.addGameObject(ai, random.nextInt(oceaan.getWorldWidth()), random.nextInt(oceaan.getWorldHeight()));
        startAlarm();
    }
}
