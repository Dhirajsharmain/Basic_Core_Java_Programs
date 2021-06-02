package bridgelabz;

import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Three Numbers : ");
        double userInput1 = scanner.nextDouble();
        double userInput2 = scanner.nextDouble();
        double userInput3 = scanner.nextDouble();

        if (userInput1 >= userInput2 && userInput1 >= userInput3)
            System.out.println(userInput1 + " is the largest number.");

        else if (userInput2 >= userInput1 && userInput2 >= userInput3)
            System.out.println(userInput2 + " is the largest number.");

        else
            System.out.println(userInput3 + " is the largest number.");
    }
}
