package week1_assignment;

import java.util.Scanner;

public class JavaCondition {
    public static void main(String[] args) {

        int day = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter number for a day: ");
        day = userInput.nextInt();

        if(day == 1){
            System.out.println("Sun");
        }else if (day == 2){
            System.out.println("Mon");
        }else if (day == 3){
            System.out.println("Tue");
        }else if (day == 4){
            System.out.println("Wed");
        }else if (day == 5){
            System.out.println("Thu");
        }else if (day == 6){
            System.out.println("Fri");
        }else if (day == 7){
            System.out.println("Sat");
        }else {
            System.out.println("Invalid Input");
        }
    }
}
