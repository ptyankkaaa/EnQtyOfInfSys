package com.example;

import java.io.Console;
import java.util.Scanner;

public class Calculator {

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double min(double num1, double num2) {
        return num1 - num2;
    }

    public static double milt(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        return num1 / num2;
    }

    public static double ste(double num1, double num2) {
        double result = num1;
        for (int i = 0; i < num2; i++ ){
            result*=num1;
        }
        return result;   
    }

    public static double proc(double num1, double num2) {
        return num2*100/num1;
    }



    public static void main(String[] args) {
        double num1, num2, result;
        char op;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        num1 = scanner.nextDouble();

        System.out.println("Введите операцию: ");
        op = scanner.next().charAt(0);

        System.out.println("Введите второе число: ");
        num2 = scanner.nextDouble();

        

        switch (op){
            case '+': System.out.print(sum(num1, num2));
                break;
            case '-': System.out.print(min(num1, num2));
                break;
            case '*': System.out.print(milt(num1, num2));
                break;
            case '/': System.out.print(div(num1, num2));
                break;
            case '^': System.out.print(ste(num1, num2));
                break;
            case '%': System.out.print(proc(num1, num2));
                break;
        }
    }
}