package class4;

import java.util.Scanner;

public class APIHandler {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter status: ");
        int status = userInput.nextInt();

        switch (status){
            case 200:
                System.out.println("OK");
                break;
            case 404:
                System.out.println("Not Found");
                break;
            case 500:
                System.out.println("Internal Server Error");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

        userInput.close();
    }
}
