package bridgelabz;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        if (userInput % 2 == 0)
            System.out.println(userInput + " is even");
        else
            System.out.println(userInput + " is odd");
    }
}
