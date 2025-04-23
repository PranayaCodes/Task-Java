
import java.util.Scanner;
public class Task22 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int reverse = 0;
        int rem = 0;
        sc.close();
        for (;num != 0; num = num / 10) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
        }
        if(originalNum == reverse){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not palindrome");
        }
        
        }
    }