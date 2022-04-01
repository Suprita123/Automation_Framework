package Java_programs;

import java.util.Scanner;

public class Prime_number1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int num = scn.nextInt();
        boolean check_p = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                check_p = false;
                break;
            }
        }
                if (check_p == true) {

                    System.out.println("Input value " + num + "is a prime number");
                } else {
                    System.out.println("Input value " + num + "is not a prime number");

                }
            }
        }







