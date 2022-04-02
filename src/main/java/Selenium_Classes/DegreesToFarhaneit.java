package Selenium_Classes;

import java.util.Scanner;

public class DegreesToFarhaneit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a temperature in Fahrenheit:");
        float Fahrenheit = sc.nextFloat();
        float Celsius;
        Celsius = ((Fahrenheit-32)*5/9);
        System.out.println("Temperature in Celsius:" +Celsius);
    }
}
