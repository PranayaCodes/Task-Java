
import java.util.Scanner;
public class Task1 {

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your full name:");
            String name=sc.nextLine();
            System.out.println("Hello"+name);
        }

    }
}