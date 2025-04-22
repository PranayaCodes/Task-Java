import java.util.Scanner;
public class Taskq5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The First Number:");
            int num1= sc.nextInt();
            System.out.println("Enter The second Number:");
            int num2= sc.nextInt();
            System.out.println("Enter The Third Number:");
            int num3 = sc.nextInt();
            if(num1 > num2 && num1 > num3){
                System.out.print("The largest number is:"+num1);
                
            }
            else if (num2 > num1 && num2 > num3 ){
                System.out.print("The larges number is:"+num2);
            }
            else{
                System.out.println("The largest number is "+num3);
            }
        }


    }
    
}
