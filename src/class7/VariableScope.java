package class7;

public class VariableScope {
    public static String name;
    public int age; //instance variable

    public static void sum(int a, int b){
        int sum = a + b;

        if (sum == 10){
            int newVal = 0;
        }
    }
    public static  void main(String[] args){
        System.out.println(name);
    }
}
