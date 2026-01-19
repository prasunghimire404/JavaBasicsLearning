package week1_assignment;

import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        double usdAmount = 0, inrAmount = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a amount in USD:");
        usdAmount = userInput.nextDouble();

        inrAmount = usdAmount * 83;

        System.out.print("$" + usdAmount + " is " + "INR" + inrAmount);

        userInput.close();
    }
}
