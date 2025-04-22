import java.util.Scanner;

public class Taskq4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            if (num%5==0 && num%11==0){
                System.out.println("It is divisible by both 5 and 11");
            }
            else{
                System.out.println("It is not divisible by both 5 and 11");
            }
        }


    }
    
}
