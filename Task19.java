import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPerfectSquare = false;

        if (num >= 0) {
            for (int i = 1; i * i <= num; i++) {
                if (i * i == num) {
                    isPerfectSquare = true;
                    break;
                }
            }
        }

        if (isPerfectSquare) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is NOT a perfect square.");
        }

        sc.close();
    }
}
