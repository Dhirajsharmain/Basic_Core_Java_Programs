package bridgelabz;

import java.util.Scanner;

public class VowelOrConsonantIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a alphabet: ");
        String userInput = scanner.nextLine();

        if (userInput.equals("a") || userInput.equals("e") || userInput.equals("i") || userInput.equals("o") || userInput.equals("u")) {
            System.out.println(userInput + " is vowel");
        } else {
            System.out.println(userInput + " is consonant");
        }
    }
}
