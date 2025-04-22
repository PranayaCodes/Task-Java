import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long factorial = 1; // long is used for handling large number 
        for (int i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
        sc.close();
    }

}