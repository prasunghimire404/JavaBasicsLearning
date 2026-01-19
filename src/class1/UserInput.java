package class1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter Your Full Name: ");
        String userName = userInput.nextLine();

        System.out.print("Enter your Age: ");
        int userAge = userInput.nextInt();


        System.out.println("Your full name is " + userName + ".");
        System.out.println("Your are " + userAge + " years old" + ".");

        userInput.close();
    }
}
