import java.util.Scanner;

public class input_information {
    public static void main(String[] args) {
        System.out.print("enter your name: ");
        Scanner sc= new Scanner(System.in);
        String name=  sc.nextLine();
        System.out.print("enter your email id: ");
        String mail=sc.nextLine();
        System.out.println("name: " + name);
        System.out.println("email id: " + mail);
        sc.close();

    
    }
    
}
