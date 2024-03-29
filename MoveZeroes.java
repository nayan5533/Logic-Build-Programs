/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movezeroes;

/**
 *
 * @author nayan
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        
        int index = 0;

    
        for (int num : nums) {
            
            if (num != 0) {
                nums[index++] = num;
            }
        }

        
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Original array: " + java.util.Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println("Array after moving zeroes to the end: " + java.util.Arrays.toString(nums));
    }
}

