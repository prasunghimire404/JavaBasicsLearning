package class1;

import java.util.Scanner;

public class RectangeArea {
    public static  void main(String[] args){
        double length = 0;
        double breadth = 0;
        double area = 0;
        double perimeter = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter length of rectangle in cm: ");
        length = userInput.nextDouble();

        System.out.print("Enter breadth of rectangle in cm: ");
        breadth = userInput.nextDouble();

        area = length * breadth;
        perimeter = 2 * ( length + breadth);

        System.out.println("\n The area of rectangle having length " + length +"cm and breadth " + breadth + "cm" + " is " + area + "cm²");

        System.out.println("\n The perimeter of rectangle having length " + length +"cm and breadth " + breadth + "cm" + " is " + perimeter + "cm");


        userInput.close();

    }

}
