/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validpalindrome;

/**
 *
 * @author nayan
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
      
        s = s.toLowerCase();

      
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        
        int left = 0;
        int right = s.length() - 1;

        
        while (left < right) {
           
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
         
            left++;
            right--;
        }
       
        return true;
    }

    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal: Panama";
        String str2 = "race a car";
        String str3 = "hello";
        String str4 = "Madam, I'm Adam";

        System.out.println("Is \"" + str1 + "\" a valid palindrome? " + isPalindrome(str1));
        System.out.println("Is \"" + str2 + "\" a valid palindrome? " + isPalindrome(str2));
        System.out.println("Is \"" + str3 + "\" a valid palindrome? " + isPalindrome(str3));
        System.out.println("Is \"" + str4 + "\" a valid palindrome? " + isPalindrome(str4));
    }
}

