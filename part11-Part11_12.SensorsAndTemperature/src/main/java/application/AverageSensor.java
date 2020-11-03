package application;

import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> avgReadings;

    public AverageSensor() {
        sensors = new ArrayList<>();
        avgReadings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }
    
    

    public boolean isOn() {

        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    public int read() {
        if (sensors.isEmpty() || !this.isOn()) {
            throw new IllegalStateException();
        }
        int total = 0;
        for (Sensor sensor : sensors) {
            total += sensor.read();
        }
        int average = total / sensors.size();
        avgReadings.add(average);
        return average;
    }
    
    public List<Integer> readings() {
        
        return this.avgReadings;
    }
}
