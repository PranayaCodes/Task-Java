// Input a number from the user and display whether it is a prime number using a for loop.

import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is less than 2, since prime numbers are greater than 1
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else {
            // Check for factors of the number
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }

        scanner.close();
    }
    
}
