/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reversewords;

/**
 *
 * @author nayan
 */
public class ReverseWords {
    public static String reverseWords(String s) {
        // Split the string by whitespaces into an array of words
        String[] words = s.trim().split("\\s+");

        StringBuilder reversedString = new StringBuilder();

        // Iterate through the array of words in reverse order and append them to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            // Append a space if it's not the last word
            if (i > 0) {
                reversedString.append(" ");
            }
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String str1 = "the sky is blue";
        String str2 = "  hello world!  ";
        String str3 = "a good   example";

        System.out.println("Original string: \"" + str1 + "\"");
        System.out.println("Reversed string: \"" + reverseWords(str1) + "\"");

        System.out.println("Original string: \"" + str2 + "\"");
        System.out.println("Reversed string: \"" + reverseWords(str2) + "\"");

        System.out.println("Original string: \"" + str3 + "\"");
        System.out.println("Reversed string: \"" + reverseWords(str3) + "\"");
    }
}

