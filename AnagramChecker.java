/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.anagramchecker;
import java.util.Arrays;

/**
 *
 * @author nayan
 */


public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();


        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

     
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        String str3 = "hello";
        String str4 = "lives";

        System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams? " + areAnagrams(str1, str2));
        System.out.println("\"" + str1 + "\" and \"" + str3 + "\" are anagrams? " + areAnagrams(str1, str3));
        System.out.println("\"" + str1 + "\" and \"" + str4 + "\" are anagrams? " + areAnagrams(str1, str4));
    }
}

