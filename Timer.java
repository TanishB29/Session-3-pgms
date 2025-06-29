 Use a while loop to simulate a countdown timer from 10 to 1. Stop early if the countdown hits 5 using break. 

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                int i = 10;

                while (i >= 1) {
                    if (i == 5) {
                        break; 
                    }

                    System.out.println(i);
                    i--;
                }
            }
        }
