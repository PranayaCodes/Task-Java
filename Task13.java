// Take a number n and print the sum of first n natural numbers using a loop.
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter a number: ");
        scanner.close();
        int n = scanner.nextInt();

        int sum = 0;

        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}
