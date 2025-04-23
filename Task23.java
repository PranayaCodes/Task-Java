/*Input n and print the first n terms of the Fibonacci series.
 */
import java.util.Scanner;
public class Task23 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int a = 0;int b = 1;
        for(int i = 1;i<=num;i++){
            System.out.println(a);

            int next = a + b;
            a = b;
            b = next;
        }
        sc.close();

    }
}