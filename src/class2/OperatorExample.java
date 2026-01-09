package class2;

public class OperatorExample {
    private static int b;

    public static void main(String[] args) {
//      1.  Arithmetic operators

        int a = 10;
        int b = 3;
        int sum, sub, mul, div, mod, gg;
//        int sum2, sub2, mul2, div2, mod2;

        sum = a + b;
        sub = a - b;
        mul = a * b;
        div = a / b;
        mod = a % b;

        System.out.println("\n---------------- 1.  Arithmetic Operators ----------------");
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " * " + b + " = " + mul);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " % " + b + " = " + mod);


        System.out.println("\n---------------- 2.  Augmented Assignment Operators ----------------");
        gg = 10;
        gg += b;
        System.out.println("(" + a + " += " + b + ") = " + gg);
        gg = 10;
        gg -= b;
        System.out.println("(" + a + " -= " + b + ") = " + gg);
        gg = 10;
        gg *= b;
        System.out.println("(" + a + " *= " + b + ") = " + gg);
        gg = 10;
        gg /= b;
        System.out.println("(" + a + " /= " + b + ") = " + gg);
        gg = 10;
        gg %= b;
        System.out.println("(" + a + " %= " + b + ") = " + gg);
        gg = 10;
        gg &= b;
        System.out.println("(" + a + " &= " + b + ") = " + gg);
        gg = 10;
        gg |= b;
        System.out.println("(" + a + " |= " + b + ") = " + gg);


        System.out.println("\n---------------- 3.  Increment and Decrement Operators ----------------");
        int  i=1, n=5;

        i++;
        System.out.println(i);

        n--;
        System.out.println(n);


    }
}
