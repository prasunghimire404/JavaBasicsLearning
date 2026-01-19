package class6;

public class MDArray {

    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 110, 120}
        };

        System.out.println("2D Array (Matrix) contents:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }
        System.out.println("Sum of all elements: " + sum);

        int max = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > max) {
                    max = matrix[row][col];
                }
            }
        }
        System.out.println("Largest element: " + max);

        System.out.println("\nExample of a Jagged Array:");
        int[][] jagged = {
                {1, 2},
                {3, 4, 5, 6},
                {7}
        };

        for (int row = 0; row < jagged.length; row++) {
            for (int col = 0; col < jagged[row].length; col++) {
                System.out.print(jagged[row][col] + " ");
            }
            System.out.println();
        }
    }
}