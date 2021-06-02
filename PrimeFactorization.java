package bridgelabz;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int userInput = scanner.nextInt();

        System.out.print("Prime Factors of "+userInput+" is : ");

        for(int i = 2; i< userInput; i++) {
            while(userInput%i == 0) {
                System.out.print(i+" , ");
                userInput = userInput/i;
            }
        }
        if(userInput >2) {
            System.out.println(userInput);
        }
    }
}
