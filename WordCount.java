/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wordcount;

/**
 *
 * @author nayan
 */
public class WordCount {
    public static int countWords(String str) {

        str = str.trim();

        
        if (str.isEmpty()) {
            return 0;
        }

   
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "  How    are  you today? ";

        System.out.println("Number of words in \"" + str1 + "\": " + countWords(str1));
        System.out.println("Number of words in \"" + str2 + "\": " + countWords(str2));
    }
}

