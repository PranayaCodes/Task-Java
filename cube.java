import java.util.Scanner;

public class cube {
    public static void calculate(int number) {
       int result=number*number*number;
       System.err.println("The Cube Of The Number is:"+result);

        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.println("Enter the Number:");
        int number=sc.nextInt();
        sc.close();
        calculate(number);
        
    }
    
}
