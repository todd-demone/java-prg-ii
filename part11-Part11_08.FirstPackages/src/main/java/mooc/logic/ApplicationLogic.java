package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {

    private UserInterface ui;
    
    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }
    
    public void execute(int times) {
        int index = 0;
        while (index < times) {
            System.out.println("Application logic is working");
            ui.update();
            index += 1;
        }
    }
}
