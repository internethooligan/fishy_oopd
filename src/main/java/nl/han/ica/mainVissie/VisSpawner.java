package nl.han.ica.mainVissie;

import nl.han.ica.OOPDProcessingEngineHAN.Alarm.Alarm;
import nl.han.ica.OOPDProcessingEngineHAN.Alarm.IAlarmListener;

import java.util.Random;

/**
 * Deze klasse zorg er voor dat er andere vissen in het water worden gespawned
 * @author harry
 */
public class VisSpawner implements IAlarmListener {

    private Random random;
    private Oceaan oceaan;
    private float vissenPerSeconde;

    VisSpawner(float vissenPerSeconde, Oceaan oceaan){
        this.vissenPerSeconde = vissenPerSeconde;
        this.oceaan = oceaan;
        random=new Random();
        startAlarm();
    }

    private void startAlarm() {
        Alarm alarm=new Alarm("Nieuwe vis",1/vissenPerSeconde);
        alarm.addTarget(this);
        alarm.start();
    }


    @Override
    public void triggerAlarm(String alarmName) {
        System.out.println("Spawn AI hier...");
    }
}
