/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorialcalculator;

import java.util.Scanner;

/**
 *
 * @author nayan
 */


public class FactorialCalculator {

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        
        try {
            int num = scanner.nextInt();
            if (num < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                int result = factorial(num);
                System.out.println("The factorial of " + num + " is: " + result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}

