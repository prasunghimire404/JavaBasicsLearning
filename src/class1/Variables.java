package class1;

public class Variables {

    public static void main(String[] args) {
        //  Variable Types
        //  A. Primitive Data Types
        // 1. int
        // 2. long
        // 3. byte
        // 4. float
        // 5. double
        // 6. char
        // 7. boolean

        //  B. Reference Data Types
        //  1. String
        //  2.
        //  3.
//        Examples

        // 1. int

        int age = 22;
        int year = 2026;

        System.out.println(age);
        System.out.println("The year is " + year + "\n");


        // 2. double

        double temp = 32.56;
        double price = 25.99;

        System.out.println("Today's temperature is " + temp + "°C");
        System.out.println("You have pay $" + price + "\n");


        // 3. char
        char tempSymbol = '°';
        char currencySymbol = '$';

        System.out.println("Today's temperature is " + temp + tempSymbol);
        System.out.println("You have pay " + currencySymbol + price + "\n");


        //4. boolean
        boolean isEligibleToVote = true;
        boolean isNotOnline = false;

        System.out.println(isEligibleToVote);
        System.out.println(isNotOnline);

        //application of boolean

        if (isEligibleToVote) {
            System.out.println("\n You must be older than 18. \n");
        } else {
            System.out.println("\n You must be less than 18. \n");
        }

        //5. string

        String firstName = "Prasun";
        String lastName = "Ghimire";

        System.out.println("My name is " + firstName + " " + lastName + ".");

    }
}
