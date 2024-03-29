/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binarytodecimalconverter;

import java.util.Scanner;

/**
 *
 * @author nayan
 */


public class BinaryToDecimalConverter {

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
           
            char digit = binary.charAt(length - 1 - i);
            if (digit == '1') {
                
                decimal += Math.pow(2, i);
            } else if (digit != '0') {
                
                return -1;
            }
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        int decimal = binaryToDecimal(binary);

        if (decimal != -1) {
            System.out.println("The decimal equivalent of " + binary + " is: " + decimal);
        } else {
            System.out.println("Invalid binary number entered.");
        }

        scanner.close();
    }
}

