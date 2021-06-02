package bridgelabz;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Dividend : ");
        int dividend = scanner.nextInt();
        System.out.print("Enter The Divisor : ");
        int divisor = scanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
