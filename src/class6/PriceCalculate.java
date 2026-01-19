package class6;

public class PriceCalculate {

    public  static double calculateTotal(double[] prices){
        double totalPrice = 0;

        for (double price : prices){
            totalPrice += price;

        }

        double discountRate = 0.0;

        if (totalPrice > 1000){
            discountRate = 0.20;
        } else if (totalPrice > 600) {
            discountRate = 0.10;
        }


        double discountAmount = totalPrice * discountRate;
        return (totalPrice - discountAmount);

    }


    public static void main(String[] args){
        double[] items1 = {400, 300, 350, 200};
        System.out.println("Total for items1: " + calculateTotal(items1));

        double[] items2 = {200, 250, 180};
        System.out.println("Total for items2: " + calculateTotal(items2));


        double[] items3 = {100, 200, 150};
        System.out.println("Total for items3: " + calculateTotal(items3));
    }
}
