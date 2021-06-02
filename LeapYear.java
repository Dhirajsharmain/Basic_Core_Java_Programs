package bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year you want to check : ");
        int year = scanner.nextInt();
        int result1 = year%4;
        int result2 = year%100;
        int result3 = year%400;

        if (result1 == 0 && result2 != 0 || result3 == 0){
            System.out.println(year+ " : is leap year");
        }
        else {
            System.out.println(year+ " : is not a leap year");
        }
     }
}
