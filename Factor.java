import java.util.Scanner;

public class Factor {

    public static void printFactors(int number) {
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        printFactors(num);
        scanner.close();
    }
}
