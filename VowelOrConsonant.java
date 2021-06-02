package bridgelabz;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a alphabet: ");
        String userInput = scanner.next();
        String[] vowels = {"a", "e", "i", "o", "u"};

        boolean isVowel = false;

        for (int i = 0; i < vowels.length; i++) {
            if (vowels[i].equals(userInput)) {
                isVowel = true;
            }
        }
        if (isVowel) {
            System.out.println(userInput + " is a vowel ");
        } else {
            System.out.println(userInput + " is a Consonant ");
        }
    }
}
