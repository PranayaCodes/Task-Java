// Take a character input and use switch to display if it is a vowel (a, e, i, o, u).

import java.util.Scanner;

public class Task18 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0); // converts to lowercase for simplicity

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is not a vowel.");
        }

        scanner.close();
    }

}


