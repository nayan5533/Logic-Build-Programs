/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromechecker2;

/**
 *
 * @author nayan
 */
public class PalindromeChecker2 {
    public static boolean isPalindrome(String str) {
        
        str = str.toLowerCase();

        
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        
        int left = 0;
        int right = str.length() - 1;

        
        while (left < right) {
            
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal, Panama";
        String str2 = "racecar";
        String str3 = "hello";

        System.out.println("Is \"" + str1 + "\" a palindrome? " + isPalindrome(str1));
        System.out.println("Is \"" + str2 + "\" a palindrome? " + isPalindrome(str2));
        System.out.println("Is \"" + str3 + "\" a palindrome? " + isPalindrome(str3));
    }
}

