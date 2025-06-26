import java.util.Scanner;

public class DivisibleByFour{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 20; i++) {
            if (i % 4 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
