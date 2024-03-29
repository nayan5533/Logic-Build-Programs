/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.missingnumber;

/**
 *
 * @author nayan
 */
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};

        System.out.println("The missing number in the array is: " + missingNumber(nums));
    }
}

