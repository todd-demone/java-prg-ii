package FlightControl.ui;

import FlightControl.logic.FlightControl;
import java.util.Scanner;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;

public class TextUI {

    private FlightControl flightControl;
    private Scanner scanner;
    
    public TextUI(FlightControl flightControl, Scanner scanner) {
        this.scanner = scanner;
        this.flightControl = flightControl;
    }
    
    public void start() {
        startAssetControl();
        System.out.println("");
        startFlightControl();
        System.out.println("");
    }
    
    private void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        
        while (true){
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            
            System.out.print("> ");
            String input = scanner.nextLine();
            
            if (input.equals("x")) {
                break;
            } else if (input.equals("1")) {
                addAirplane();
            } else if (input.equals("2")) {
                addFlight();
            }
        }
    }
    
    private void addAirplane() {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());
        this.flightControl.addAirplane(id, capacity);
    }
    
    private void addFlight() {
        System.out.print("Give the airplane id: ");
        Airplane airplane = askForAirplane();
        System.out.print("Give the departure airport id: ");
        String departureID = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String targetID = scanner.nextLine();
        
        this.flightControl.addFlight(airplane, departureID, targetID);
    }
    
    private void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String answer = scanner.nextLine();
            if (answer.equals("1")) {
                printAirplanes();
            } else if (answer.equals("2")) {
                printFlights();
            } else if (answer.equals("3")) {
                printAirplaneDetails();
            } else if (answer.equals("x")) {
                break;
            }
        }
    }
    
    private void printAirplanes() {
        for (Airplane airplane: this.flightControl.getAirplanes()) {
            System.out.println(airplane);
        }
    }
    
    private void printFlights() {
        for (Flight flight: this.flightControl.getFlights()) {
            System.out.println(flight);
            
        }
        System.out.println("");
    }
    
    private void printAirplaneDetails() {
        System.out.print("Give the airplane id: ");
        Airplane airplane = askForAirplane();
        System.out.println(airplane);
        System.out.println("");
    }
    
    private Airplane askForAirplane() {
        Airplane airplane = null;
        while (airplane == null) {
            String id = scanner.nextLine();
            airplane = this.flightControl.getAirplane(id);
            
            if (airplane == null) {
                System.out.println("No airplane with id " + id + ".");
            }
        }
        return airplane;
    }
}
