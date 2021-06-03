package bridgelabz.functional;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] myArray = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print("Enter the value For " + i + j + " Index : ");
                myArray[i][j] = scanner.nextInt();
            }
        }
        System.out.print(printTwoDimensionalArray(myArray));
        //System.out.print(Arrays.deepToString(myArray));
    }

    private static int printTwoDimensionalArray(int[][] result) {
        System.out.println("Array matrix : ");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }

}

