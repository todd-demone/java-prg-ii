package application;

public class Program {

    public static void main(String[] args) {
        // you can test your classes here:
//        StandardSensor ss = new StandardSensor(1);
//        
//        System.out.println(ss.read());
//        
//        System.out.println(ss.isOn());
//        ss.setOff();
//        System.out.println(ss.isOn());

//        TemperatureSensor ts = new TemperatureSensor();
//        System.out.println(ts.isOn());
//        ts.setOn();
//        System.out.println(ts.isOn());
//        System.out.println(ts.read());
//        ts.setOff();
//        System.out.println(ts.isOn());
//        System.out.println(ts.read());

        AverageSensor avgSensor = new AverageSensor();
        StandardSensor oakville = new StandardSensor(4);
        oakville.setOn();
        System.out.println("Temperature in Oakville is: " + oakville.read() + " degrees celsius.");
        StandardSensor burlington = new StandardSensor(5);
        StandardSensor miltonTS = new StandardSensor(6);
        avgSensor.addSensor(oakville);
        avgSensor.addSensor(burlington);
        avgSensor.addSensor(miltonTS);
        avgSensor.setOn();
        System.out.println("Temperature in South Halton is " + avgSensor.read() + " degrees celsius.");
        System.out.println("Temperature in South Halton is " + avgSensor.read() + " degrees celsius.");
        System.out.println("Temperature in South Halton is " + avgSensor.read() + " degrees celsius.");
        System.out.println("readings: " + avgSensor.readings());
        
    }

}
