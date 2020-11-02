package com.company;

import java.util.Locale;
import java.util.Scanner;

public class SingleOperationCalculator {

    public enum Operace {
        NASOBENI('*'),
        DELENI ('/'),
        SCITANI ('+'),
        ODCITANI ('-');

        public char operator() {
            return operator;
        }

        private final char operator;

        Operace(char operator) {
            this.operator=operator;
        }
        //char operator() { return operator; }
    }
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
        switch (operator) {
            case '+':  // use switch
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                // operator doesn't match any case constant (+, -, *, /)
                System.out.printf("Error! operator is not correct");
                return;
        }
        System.out.printf(first + " " + operator + " " + second + " = " + result);
    }
}
