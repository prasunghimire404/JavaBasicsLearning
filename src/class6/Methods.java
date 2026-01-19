package class6;

public class Methods {
    public static void addition(int a, int b) {
        System.out.println("SUM = "+ (a+b));
    }

    public static void multiplication(){
        System.out.println("Sum = " + (2*3));
    }

    public static int division(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        addition(5, 5); // method call
        multiplication();
        int returnedVal = division(100, 2);

        System.out.print(returnedVal);
    }
}