import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (password.equals("1234")) {
                System.out.println("Access Granted!");
                break;
            } else {
                attempts--;
                System.out.println("Wrong password. Attempts left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Access Denied!");
        }
    }
}
