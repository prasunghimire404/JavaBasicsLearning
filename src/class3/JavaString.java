package class3;

public class JavaString {
    public static void main(String[] args) {
        String fName = "John";
        String lName = "Rai";

        String newVal1 = new String("Hello");
        String newVal2 = new String("Hello");
        String newVal3 = new String("hello");


        System.out.println(fName);
        System.out.println(newVal1);

        //String Manipulation
        System.out.println("\n============ String Manipulation ============");
        System.out.println(fName.length());
        System.out.println(fName.charAt(1));
        System.out.println(fName.toUpperCase());
        System.out.println(fName.toLowerCase());
        System.out.println(fName + " " + lName);

        //String Compression
        System.out.println("\n============ String Compression ============");
        System.out.println("\n" + fName.equals(lName));
        System.out.println(newVal1.equals(newVal2));

        System.out.println("\n" + newVal1.equals(newVal3));
        System.out.println(newVal1.equalsIgnoreCase(newVal3));

        //Substring

        System.out.println("\n============ Substring ============");
        String txt = "This is Java";
        System.out.println("\nOriginal Txt: " + txt);
        System.out.println(txt.substring(5,7));
        System.out.println(txt.substring(5));

    }
}
