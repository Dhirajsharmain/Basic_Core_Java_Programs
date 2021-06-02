package bridgelabz;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        float firstNumber = 36.2f, secondNumber = 52.5f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + firstNumber);
        System.out.println("Second number = " + secondNumber);

        firstNumber = firstNumber - secondNumber;
        secondNumber = firstNumber + secondNumber;
        firstNumber = secondNumber - firstNumber;

        System.out.println("--After swap--");
        System.out.println("First number = " + firstNumber);
        System.out.println("Second number = " + secondNumber);
    }
}
