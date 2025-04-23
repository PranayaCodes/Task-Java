/*Write a program to count how many digits are in a given number using a loop. */
import java.util.Scanner;
public class Task24 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1;i<=num;i++){
            num %= 10;
            count +=1;

        }
        System.out.println("The number has "+ count+ " digits");
        sc.close();
    }
}