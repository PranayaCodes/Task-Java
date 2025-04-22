import java.util.Scanner;
public class Taskq6 {
    public static void main(String[] args) {
        int num1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number:");
            num1 = sc.nextInt();
        }
        if (num1 % 2 ==0){
            System.out.println("Print The It is Even number");
        }
        else{
            System.out.println("It is not Even");
        }
    }
}
