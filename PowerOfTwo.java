package bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int N = scanner.nextInt();

        if (N > 0 && N < 31){
            powerTable(N);
        }
        else {
            System.out.println("Please enter value less than 32");
        }
    }

    private static void powerTable(int N){
        for (int i = 1; i <= N; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
    }
}
