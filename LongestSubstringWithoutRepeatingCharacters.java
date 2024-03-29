/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.longestsubstringwithoutrepeatingcharacters;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nayan
 */


public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
     
        Map<Character, Integer> charMap = new HashMap<>();
        
        int maxLength = 0;
        int start = 0;
        
       
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            
            
            if (charMap.containsKey(c) && charMap.get(c) >= start) {
                
                start = charMap.get(c) + 1;
            }
            
           
            charMap.put(c, end);
            
            
            int currentLength = end - start + 1;
            
            
            maxLength = Math.max(maxLength, currentLength);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String str1 = "abcabcbb";
        String str2 = "bbbbb";
        String str3 = "pwwkew";

        System.out.println("Length of the longest substring without repeating characters in \"" + str1 + "\": " + lengthOfLongestSubstring(str1));
        System.out.println("Length of the longest substring without repeating characters in \"" + str2 + "\": " + lengthOfLongestSubstring(str2));
        System.out.println("Length of the longest substring without repeating characters in \"" + str3 + "\": " + lengthOfLongestSubstring(str3));
    }
}

