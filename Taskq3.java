import java.util.Scanner;
public class Taskq3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number");
            int num= sc.nextInt();
            
            if (num>0){
                System.out.println("It is positive number.");
            }
            else if (num<0){
                System.out.println("It is a negative number.");
            }
            else{
                System.out.println("It is a zero.");
            }
        }

        
    }

    
}
