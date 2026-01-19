package class4;

public class NumberRevers {
    public static void main(String[] args) {
        int num = 12345;
        int revNum = 0;

        int orginalNum = num;

        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }

        System.out.println("Reverse Number of " + orginalNum + " is " + revNum);
    }
}
