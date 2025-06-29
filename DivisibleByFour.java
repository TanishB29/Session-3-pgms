Print numbers from 1 to 20, but skip numbers divisible by 4 using continue. 


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
