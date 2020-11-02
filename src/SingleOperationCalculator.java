package com.company;

import java.util.Locale;
import java.util.Scanner;

public class SingleOperationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Enter two numbers: ");
        System.out.print("first: ");
        int first = scanner.nextInt();
        scanner.nextLine();
        System.out.print("second: ");
        int second = scanner.nextInt(); // code duplicity
        scanner.nextLine();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.nextLine().charAt(0); // danger -> potential source of error
        double result;
        //int firstTmp=(int)first;
        //int secondTmp=(int)second;
        if (operator == '+') { // use switch
            result = first + second;
        } else if (operator == '-') {
            result = first - second;
        } else if (operator == '*') {
            result = first * second;
        } else if (operator == '/') {
            result = first / second;
        } else {
            // operator doesn't match any case constant (+, -, *, /)
            System.out.printf("Error! operator is not correct");
            return;
        }
        System.out.printf(first + " " + operator + " " + second + " = " + result);
    }
}
