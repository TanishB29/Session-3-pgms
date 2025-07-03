import java.util.Scanner;

public class DivBySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("Enter a number:");
            num = sc.nextInt();

            if (num % 7 == 0) {
                System.out.println("Good! " + num + " is a multiple of 7.");
                break;
            } else {
                System.out.println(num + " is not a multiple of 7. Try again!");
            }
        }
    }
}
