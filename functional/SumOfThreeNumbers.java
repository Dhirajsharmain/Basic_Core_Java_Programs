package bridgelabz.functional;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        int[] myArray = {0, 1, 2, -2, 3, -3, -1};

        System.out.print(sumOfThreeIsZero(myArray));
    }

    private static int sumOfThreeIsZero(int[] arr) {
        System.out.println("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println("Sum of these " + arr[i] + " " + arr[j] + " " + arr[k] + " = 0");
                    }
                }
            }
        }
        return 0;
    }
}
