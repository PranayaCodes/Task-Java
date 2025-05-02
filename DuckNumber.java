import java.util.Scanner;

public class DuckNumber {

    public static void determine(int number) {
        String numStr = Integer.toString(number);
        
        if (numStr.charAt(0) == '0') {
            System.out.println("Not a Duck Number (starts with 0)");
            return;
        }

        if (numStr.contains("0")) {
            System.out.println("It is a Duck Number.");
        } else {
            System.out.println("It is Not a Duck Number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        determine(number);
        sc.close();
    }
}
