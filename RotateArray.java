/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rotatearray;

/**
 *
 * @author nayan
 */
public class RotateArray {
    public static void rotate(int[] nums, int k) {
      
        if (nums == null || nums.length == 0 || k < 0) {
            throw new IllegalArgumentException("Invalid input: Array cannot be empty and k must be non-negative.");
        }

        int n = nums.length;
        
        k %= n;

        
        reverse(nums, 0, n - 1);
       
        reverse(nums, 0, k - 1);
        
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original array: " + java.util.Arrays.toString(nums));
        rotate(nums, k);
        System.out.println("Rotated array by " + k + " steps to the right: " + java.util.Arrays.toString(nums));
    }
}

