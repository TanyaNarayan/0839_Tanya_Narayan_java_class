import java.util.Scanner;

public class password_checker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int length = password.length();

        if (length < 8) {
            System.out.println("Password is too short.");
        }
        else if (length < 12) {
            System.out.println("Password is acceptable.");
        }
        else {
            System.out.println("Password is strong.");
        }

        sc.close();
    }
}