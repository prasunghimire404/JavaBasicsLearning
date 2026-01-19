package class7;

import java.util.Scanner;

public class ATMSystem {
    static Scanner userInput = new Scanner(System.in);
    static int userBalance = 85000;

    public static int depositCash(){
        System.out.print("Enter Amount to Deposit Cash: ");
        int depoAmt = userInput.nextInt();
        userBalance += depoAmt;
        System.out.println("You have Deposit $" + depoAmt);
        return userBalance;
    }

    public static int withdrawCash(){
        System.out.print("Enter Amount to Withdraw Cash: ");
        int drawAmt = userInput.nextInt();
        userBalance += drawAmt;
        System.out.println("You have Withdraw $" + drawAmt);
        return userBalance;
    }


    public static void main(String[] args) {
        String userChoice = "";

        while (!userChoice.equals("E")) {
            System.out.println("Enter 'C' for Check Balance");
            System.out.println("Enter 'D' for Deposit Cash");
            System.out.println("Enter 'W' for Withdraw Cash");
            System.out.println("Enter 'E' Exit");
            System.out.println("---------------------------------------------");

            userChoice = userInput.next();

            if (userChoice.equals("C")) {
                System.out.println(" Your total balance: $" + userBalance  + "\n");
            } else if (userChoice.equals("D")) {
                userBalance = depositCash();
                System.out.println("Your new total balance: $" + userBalance + "\n");
            } else if (userChoice.equals("W")) {
                userBalance = withdrawCash();
                System.out.println("Your new total balance: $" + userBalance  + "\n");
            } else if (userChoice.equals("E")) {
                System.out.println("Thank You For Using Our ATM Service 🙏"  + "\n");
                userChoice="E";
            }else {
                System.out.println("⚠️ Invalid Input!!!");
                System.out.println("Enter Write Choice Please!");
                System.out.println("---------------------------------------------");
            }

        }
        userInput.close();
    }
}
