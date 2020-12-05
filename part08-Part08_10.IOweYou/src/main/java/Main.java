
public class Main {

    public static void main(String[] args) {
        // Test your program here
        IOU toddsIOU = new IOU();
        toddsIOU.setSum("Barb", 88);
        toddsIOU.setSum("Carter", 31.5);
        System.out.println(toddsIOU.howMuchDoIOweTo("Barb"));
        System.out.println(toddsIOU.howMuchDoIOweTo("Carter"));
    }
}
