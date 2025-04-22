import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        
        char ic = sc.next().charAt(0);
        sc.close();
        
        if (ic == 'a' || ic == 'e' || ic == 'i' || ic == 'o' || ic == 'u' || 
            ic == 'A' || ic == 'E' || ic == 'I' || ic == 'O' || ic == 'U') {
            System.out.println(ic + " is a vowel letter");
        } else {
            System.out.println(ic + " is a consonant");
        }
    }
}
