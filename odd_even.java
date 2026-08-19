
import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
       // check if it is odd or even using if else
        System.out.println("enter a number to check if it is odd or even");
        Scanner ob=new Scanner(System.in);
        int num =ob.nextInt();
        if(num%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
        ob.close();
    }
}
