package bridgelabz.functional;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        int x1 = 0, y1 = 0;
        int x2, y2;

        double distance;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        x2 = scanner.nextInt();
        System.out.print("Enter the value of y : ");
        y2 = scanner.nextInt();

        distance = EuclideanDistance(x1, y1, x2, y2);

        System.out.println("Euclidean Distance of x and y from origin is : " + distance);
        scanner.close();

    }

    private static double EuclideanDistance(int x1, int y1, int x2, int y2) {
        double distance, powerofx, powerofy, sumOfPowerXY;
        int x, y;
        x = x2 - x1;
        y = y2 - y1;
        powerofx = Math.pow(x, 2);
        powerofy = Math.pow(y, 2);

        sumOfPowerXY = powerofx + powerofy;

        distance = Math.sqrt(sumOfPowerXY);
        return distance;
    }
}
