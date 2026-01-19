package class4;

import java.util.Scanner;

public class ATMWithdrawSystem {
    public static void main(String[] args) {

        int balance = 5000;

        int withdrawAmount = 0;
            Scanner userInput = new Scanner(System.in);


        while (balance >= 0) {
            System.out.println("Your Current Balance: $" + balance);
            System.out.print("Enter Amount to Withdraw: ");
            withdrawAmount = userInput.nextInt();
            System.out.println("You have withdraw $" + withdrawAmount + ".\n");
            if (balance >= withdrawAmount){
                balance -= withdrawAmount;
            }else{
                System.out.println("Insufficient Balance!");
            }
        }

        System.out.println("Invalid Amount!");

        userInput.close();
    }
}
