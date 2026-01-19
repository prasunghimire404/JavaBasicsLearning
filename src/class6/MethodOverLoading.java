package class6;

public class MethodOverLoading {

    public static void sum(int a, int b){
        System.out.println(a + b);
    }

    public static void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }

    public static  void sum(double a, double b){
        System.out.println(a + b);
    }

    public static  void main(String[] args){
        sum(5, 6.8 );
        sum(4, 3, 8);
    }
}
