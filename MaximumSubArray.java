/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maximumsubarray;

/**
 *
 * @author nayan
 */
public class MaximumSubArray {
    public static int maxSubArray(int[] nums) {
    
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array is empty.");
        }

       
        int maxSum = nums[0];
        int currentSum = nums[0];

        
        for (int i = 1; i < nums.length; i++) {
           
            currentSum = Math.max(nums[i], currentSum + nums[i]);
        
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {-1, -2, -3, -4, -5};

        System.out.println("Maximum sum of contiguous subarray in [-2, 1, -3, 4, -1, 2, 1, -5, 4]: " + maxSubArray(nums1));
        System.out.println("Maximum sum of contiguous subarray in [1, 2, 3, 4, 5]: " + maxSubArray(nums2));
        System.out.println("Maximum sum of contiguous subarray in [-1, -2, -3, -4, -5]: " + maxSubArray(nums3));
    }
}

