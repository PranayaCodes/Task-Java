// input a month number (1–12) and print the number of days in that month using switch.
import java.util.Scanner;
public class Task17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Month Number: ");
        int month_number=sc.nextInt();
        sc.close();

        switch (month_number){
            case 1:
            System.out.println("January has 31days");
            break;
            case 2:
            System.out.println("Feburary has 28days");
            break;
            case 3:
            System.out.println("March has 31days");
            break;
            case 4:
            System.out.println("April has 30 days");
            break;
            case 5:
            System.out.println("May has 31 days");
            break;
            case 6:
            System.out.println("June has 30 days");
            break;
            case 7:
            System.out.println("July has 31 days");
            break;
            case 8:
            System.out.println("AUgust has 31 days");
            break;
            case 9:
            System.out.println("September as 30 days");
            break;
            case 10:
            System.out.println("October has 31 days");
            break;
            case 11:
            System.out.println("Nobember has 30 days");
            break;
            case 12:
            System.out.println("December has days");
            break;
            default:
            System.out.print("Input is invalid ! Enter a valide number");
          


        }



        
    }
    
}
