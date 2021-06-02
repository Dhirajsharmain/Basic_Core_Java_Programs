package bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        //int n = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int userInput = scanner.nextInt();
        if (userInput <= 0) {
            System.out.println("Please Enter value grater than 0");
        } else {
            for (int i = 1; i <= userInput; i++) {
                System.out.print("1/" + i);
                if (i <= userInput-1){
                    System.out.print(" + ");
                }
            }
            System.out.print(" = " + harmonicTable(userInput));
        }
    }
    private static double harmonicTable(int N) {
        float harmonic = 1;
        for (int i = 1; i < N; i++) {
            harmonic += (float) 1 / i;
        }
        return harmonic;
    }
}
