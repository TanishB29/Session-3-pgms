Write a for loop that prints all numbers divisible by 3 between 1 and 30. 

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
