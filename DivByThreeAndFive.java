Exercise 55: Count how many numbers between 1 and 100 are divisible by both 3 and 5 using a for loop and continue. 

import java.util.Scanner;

public class DivByThreeAndFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;

        for(int i=1;i<=100;i++) {
            if (i % 15 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("The total numbers divisible by both 3 and 5 from 1 to 100 are = " + count);
        }
    }
