/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringcompression;

/**
 *
 * @author nayan
 */
public class StringCompression {
    public static String compressString(String str) {
        StringBuilder compressedString = new StringBuilder();
        
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
          
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
              
                compressedString.append(str.charAt(i)).append(count);
         
                count = 1;
            }
        }
        
      
        if (compressedString.length() >= str.length()) {
            return str;
        }
        
        return compressedString.toString();
    }

    public static void main(String[] args) {
        String str1 = "aabbbcccc";
        String str2 = "abcdefgh";

        System.out.println("Original string: " + str1);
        System.out.println("Compressed string: " + compressString(str1));
        System.out.println("Original string: " + str2);
        System.out.println("Compressed string: " + compressString(str2));
    }
}

