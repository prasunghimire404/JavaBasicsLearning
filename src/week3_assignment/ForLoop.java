package week3_assignment;
public class ForLoop {
    public static void main(String[] args) {
        int i, j;

//  Print this pattern
//        1
//        22
//        333
//        4444
//        55555


        for (i=1; i <= 5; i++){
            for (j = 1; j <= i; j++){
                System.out.print(i);
            }
                System.out.print("\n");
        }


    System.out.println("----------------------------");

//  Print this pattern
//        55555
//        4444
//        333
//        22
//        1

        for (i=5; i >= 1; i--){
            for (j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }

    }
}



