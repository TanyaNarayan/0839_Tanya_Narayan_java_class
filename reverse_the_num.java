import java.util.*;
public class reverse_the_num {
    public static void main(String[] args) {
        System.out.println("enter a number  to reverse");
        Scanner ob=new Scanner(System.in);
        int num=ob.nextInt();
        int reverse = 0;
          while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reverse = " + reverse);
        ob.close();
        }
}

