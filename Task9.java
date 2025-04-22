// Take marks of five subjects and calculate the total, percentage, and grade using if-else.
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Sub Mark :");
        int sub1=sc.nextInt();
        System.out.println("Enter the Secod Sub Mark :");
        int sub2=sc.nextInt();
        System.out.println("Enter the Third Sub Mark:");
        int sub3=sc.nextInt();
        System.out.println("Enter the Forth Sub Mark:");
        int sub4=sc.nextInt();
        System.out.println("Enter the Mark of Fifth Subject:");
        int sub5=sc.nextInt();
        int total=sub1+sub2+sub3+sub4+sub5;
        double percentage=(total/500.0)*100;
        System.out.println("Total marks="+total);
        System.out.println("Prcentage="+percentage+"%");
        sc.close();
        if (percentage >=90){
            System.out.println("Congratulations you got an A+");

        }else if(percentage >=80 && percentage<89){
            System.out.println("Congratulations you got an A)");

        }else if (percentage >=70 && percentage <=79){
            System.out.println("You have got B+");

        }else if (percentage >=60 && percentage <=69){
            System.out.println("You have got B");

        }else if (percentage >=50 && percentage <=59){
            System.out.println("You have passed but work harder next time");

        }else{
            System.out.println("You have failed in the exam work hard");
        }




        
    }
    
}
