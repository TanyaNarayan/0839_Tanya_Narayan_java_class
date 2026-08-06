
import java.util.Scanner;
public class sum_of_two {
    public static void main(String[] args) {

        System.out.println("enter two numbers: ");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum= a+b;


       System.out.println("the sum of two numbers is: " + sum);
       sc.close();
       
    }
}