package bridgelabz.functional;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        int a, b, c;
        double delta;

        double equation1, equation2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for a : ");
        a = scanner.nextInt();
        System.out.print("Enter value for b : ");
        b = scanner.nextInt();
        System.out.print("Enter va3lue for c : ");
        c = scanner.nextInt();

        //now we are going to find delta
        delta = FindDelta(a, b, c);

        equation1 = QuadraticEquation1(a, b, delta);
        equation2 = QuadraticEquation2(a, b, delta);

        System.out.println("Root 1 is : " + equation1);
        System.out.println("Root 2 is : " + equation2);

        scanner.close();
    }

    private static double FindDelta(int a, int b, int c) {
        int delta = (b * b) - (4 * a * c);
        return delta;
    }

    private static double QuadraticEquation1(int a, int b, double delta) {
        double absDelta = Math.abs(delta);
        double sqrtDelta = Math.sqrt(absDelta);
        double equation1 = (-b + sqrtDelta) / (2 * a);
        return equation1;
    }

    private static double QuadraticEquation2(int a, int b, double delta) {
        double absDelta = Math.abs(delta);
        double sqrtDelta = Math.sqrt(absDelta);
        double equation2 = (-b - sqrtDelta) / (2 * a);
        return equation2;
    }
}
