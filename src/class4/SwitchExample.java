package class4;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] arg) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Day name like 'sun' : ");
        String day = userInput.nextLine();

        switch (day) {
            case "sun":
                System.out.println("5:00 AM");
                break;
            case "mon":
                System.out.println("5:30 AM");
                break;
            case "tue":
                System.out.println("6:00 AM");
                break;
            case "wed":
                System.out.println("6:30 AM");
                break;
            case "thu":
                System.out.println("7:00 AM");
                break;
            case "fri":
                System.out.println("7:30 AM");
                break;
            case "sat":
                System.out.println("8:00 AM");
                break;
        }

        userInput.close();
    }
}
