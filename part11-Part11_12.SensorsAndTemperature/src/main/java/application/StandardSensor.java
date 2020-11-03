package application;

public class StandardSensor implements Sensor {

    private int sensorLevel;

    public StandardSensor(int sensorLevel) {
        this.sensorLevel = sensorLevel;
    }

    @Override
    public int read() {
        return sensorLevel;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setOff() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
