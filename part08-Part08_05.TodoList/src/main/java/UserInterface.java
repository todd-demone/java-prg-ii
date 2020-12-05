
import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.print("Task: ");
                list.add(this.scanner.nextLine());
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                list.remove(Integer.valueOf(this.scanner.nextLine()));
            } else if (command.equals("list")) {
                list.print();
            }
        }

    }
}
