import java.util.Scanner;
public class Taskq2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number:");
            int num1 =sc.nextInt();
            System.out.println("Enatr the second number:");
            int num2 =sc.nextInt();
            int sum =num1+num2;
            int diff =num1-num2;
            int mul=num1*num2;
            int div=num1/num2;
            
            System.out.println("Sum: "+sum);
            System.out.println("Difference:"+diff);
            System.out.println("Product"+mul);
            System.out.println("Quotient"+div);
        }



    }

    
}
