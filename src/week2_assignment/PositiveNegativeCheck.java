package week2_assignment;

import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = userInput.nextInt();

        if (num > 0){
            System.out.println("\n" + num + " is positive number" );
        } else if (num < 0) {
            System.out.println(num + " is negative number");
        } else if (num == 0) {
            System.out.println("You have enter zero");
        }else {
            System.out.println("Invalid Input!");
        }

        userInput.close();
    }
}
