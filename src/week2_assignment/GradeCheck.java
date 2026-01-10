package week2_assignment;

import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your grade in number: ");
        int userGrade = userInput.nextInt();
        System.out.print("Your grade in number: " + userGrade + "\n");

        if (userGrade > 90 && userGrade < 100){
            System.out.println("Your grade in letter: A");
        } else if (userGrade >= 80 && userGrade <= 89){
            System.out.println("Your grade in letter: B");
        } else if (userGrade >= 70 && userGrade <= 79){
            System.out.println("Your grade in letter: C");
        } else if (userGrade >= 60 && userGrade <= 69){
            System.out.println("Your grade in letter: C");
        } else if (userGrade >= 0 && userGrade <= 59){
            System.out.println("Your grade in letter: F");
        }else {
            System.out.println("Invalid Grade!");
        }


        userInput.close();
    }
}
