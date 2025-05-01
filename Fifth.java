import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the principle amount:");
        int p=sc.nextInt();
        System.err.println("Enter the time:");
      
        int t=sc.nextInt();
        System.err.println("Enter the rate of interest:");
        int r=sc.nextInt();

       int  Simple_interest=(p*t*r)/100;
        System.err.println("Simple interest is:"+Simple_interest);

        sc.close();
    }
    
}
