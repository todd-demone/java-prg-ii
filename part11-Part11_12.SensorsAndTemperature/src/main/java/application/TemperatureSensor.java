package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean isItOn;
    
    public TemperatureSensor() {
        isItOn = false;
    }

    @Override
    public boolean isOn() {
        return isItOn;
    }

    @Override
    public void setOn() {
        isItOn = true;
    }

    @Override
    public void setOff() {
        isItOn = false;
    }

    @Override
    public int read() {
        if (isItOn) {
            return (new Random().nextInt(61) - 30);
        } else {
            throw new IllegalStateException();
        }
    }

}
