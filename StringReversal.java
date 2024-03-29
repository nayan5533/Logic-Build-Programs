/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringreversal;

/**
 *
 * @author nayan
 */
public class StringReversal {
    public static String reverseString(String str) {
       
        char[] charArray = str.toCharArray();
        
      
        int start = 0;
        int end = charArray.length - 1;
        
    
        while (start < end) {
            
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            
           
            start++;
            end--;
        }
        
        
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "Nayan, Patil!";
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reverseString(str));
    }
}
