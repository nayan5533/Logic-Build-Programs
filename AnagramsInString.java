/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.anagramsinstring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author nayan
 */


public class AnagramsInString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0 || s.length() < p.length()) {
            return result;
        }

        Map<Character, Integer> pMap = new HashMap<>();
        for (char c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0, count = p.length();

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            if (pMap.containsKey(rightChar)) {
                if (pMap.get(rightChar) > 0) {
                    count--;
                }
                pMap.put(rightChar, pMap.get(rightChar) - 1);
            }
            right++;

            if (count == 0) {
                result.add(left);
            }

            if (right - left == p.length()) {
                char leftChar = s.charAt(left);
                if (pMap.containsKey(leftChar)) {
                    if (pMap.get(leftChar) >= 0) {
                        count++;
                    }
                    pMap.put(leftChar, pMap.get(leftChar) + 1);
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> indices = findAnagrams(s, p);
        System.out.println("Start indices of \"" + p + "\"'s anagrams in \"" + s + "\": " + indices);
    }
}

