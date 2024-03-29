/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atoi;

/**
 *
 * @author nayan
 */
public class Atoi {
    public static int atoi(String str) {
       
        str = str.trim();

        
        if (str.isEmpty()) {
            return 0;
        }

        
        int sign = 1;
        int index = 0;
        int result = 0;

      
        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '-' ? -1 : 1;
            index++;
        }

      
        while (index < str.length() && Character.isDigit(str.charAt(index))) {
            int digit = str.charAt(index) - '0';

           
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

          
            result = result * 10 + digit;
            index++;
        }

       
        return sign * result;
    }

    public static void main(String[] args) {
        String str1 = "42";
        String str2 = "   -42";
        String str3 = "4193 with words";
        String str4 = "words and 987";
        String str5 = "-91283472332";

        System.out.println("String \"" + str1 + "\" to integer: " + atoi(str1));
        System.out.println("String \"" + str2 + "\" to integer: " + atoi(str2));
        System.out.println("String \"" + str3 + "\" to integer: " + atoi(str3));
        System.out.println("String \"" + str4 + "\" to integer: " + atoi(str4));
        System.out.println("String \"" + str5 + "\" to integer: " + atoi(str5));
    }
}

