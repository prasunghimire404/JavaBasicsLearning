package class3;

public class JavaString {
    public static void main(String[] args) {
        String fName = "John";
        String lName = "Rai";

        String newVal = new String("Hello");


        System.out.println(fName);
        System.out.println(newVal);


        System.out.println(fName.length());
        System.out.println(fName.charAt(1));
        System.out.println(fName.toUpperCase());
        System.out.println(fName.toLowerCase());
        System.out.println(fName + " " + lName);
    }
}
