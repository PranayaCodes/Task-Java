import java.util.Scanner;
public class Task12 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num + ":");

        // for loop to print the table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();


    }
    
}
