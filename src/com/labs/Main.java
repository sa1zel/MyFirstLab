package com.labs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int result = 0;
        boolean inProcess = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your numbers: \n firstNumber = ");
        int firstNumber = scanner.nextInt();
        System.out.print("secondNumber = ");
        int secondNumber = scanner.nextInt();
        System.out.print("ThirdNumber = ");
        int thirdNumber = scanner.nextInt();
        int min = 1;
        if (firstNumber != 0)
            min = firstNumber;
        if (secondNumber < min)
            min = secondNumber;
        if (thirdNumber < min)
            min = thirdNumber;
        int mod = min;
        while (inProcess && mod != 0) {
            if (min % mod == 0) {
                if (firstNumber % mod == 0 && secondNumber % mod == 0 && thirdNumber % mod == 0) {
                    result = mod;
                    inProcess = false;
                }
            }
            mod--;
        }
        if (result == 0) {
            System.out.println("Something wrong!");
        } else {
            System.out.println("Result: " + result);
        }
    }
}
