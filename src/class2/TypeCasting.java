package class2;

public class TypeCasting {
    public static void main(String[] args) {
        // Type Casting

        int number = 100;
        double price = 100.56;
        price = number;  //implicit type casting
        number = (int) price; //explicit type casting
        System.out.println(number);
    }
}
