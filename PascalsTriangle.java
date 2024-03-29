/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nayan
 */


public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

       
        if (numRows == 0) {
            return triangle;
        }

        
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

    
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> prevRow = triangle.get(rowNum - 1);
            List<Integer> row = new ArrayList<>();

          
            row.add(1);

           
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            
            row.add(1);

           
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = generate(numRows);

        
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}

