package week2_assignment;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String validUserName = "admin";
        String validPassword = "admin123";

        Scanner userInput = new Scanner(System.in);


        System.out.print("valid username: " + validUserName + "\n");
        System.out.print("Enter username: " + validPassword + "\n");

        System.out.print("\nEnter username: ");
        String userName = userInput.nextLine();

        System.out.print("Enter password: ");
        String password = userInput.nextLine();

        System.out.print("\n--------------------\n");

        if (validUserName.equals(userName) && validPassword.equals(password)){
            System.out.println("Login Successful!");
        }else if (!validUserName.equals(userName) && !validPassword.equals(password)){
            System.out.println("Invalid Username and Password!");
        }else if (!validUserName.equals(userName)){
            System.out.println("Invalid Username");
        }else if (!validPassword.equals(password)){
            System.out.println("Invalid Password!");
        }else {
            System.out.println("Invalid Input!");
        }

    }
}
