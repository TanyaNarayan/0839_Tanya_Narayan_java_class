import java.util.Scanner;
public class simple_interest {
    public static void main(String[] args) {
        System.out.println("calculation of simple interest");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the principle amount: ");
        int p=sc.nextInt();
        System.out.print("enter the time: ");
        int t=sc.nextInt();
        System.out.print("enter the rate: ");
        int r=sc.nextInt();

        double si= (p*t*r)/100;
        System.out.println("the total simple interest calculation: " + si);
        sc.close();
    }
}
