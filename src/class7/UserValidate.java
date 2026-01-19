package class7;


import java.util.Scanner;

public class UserValidate {


    static String validUserName = "admin";
    static String validPassword = "admin123";
    static String userName;
    static String password;

    public static void validateUser(String userName, String password) {
        if (validUserName.equals(userName) && validPassword.equals(password)) {
            System.out.println("Login Successful!");
        } else if (!validUserName.equals(userName) && !validPassword.equals(password)) {
            System.out.println("Invalid Username and Password!");
        } else if (!validUserName.equals(userName)) {
            System.out.println("Invalid Username");
        } else if (!validPassword.equals(password)) {
            System.out.println("Invalid Password!");
        } else {
            System.out.println("Invalid Input!");
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("valid username: " + validUserName + "\n");
        System.out.print("Enter username: " + validPassword + "\n");

        System.out.print("\nEnter username: ");
        userName = userInput.nextLine();

        System.out.print("Enter password: ");
        password = userInput.nextLine();

        System.out.print("\n--------------------\n");

        validateUser(userName, password);

        userInput.close();
    }
}


