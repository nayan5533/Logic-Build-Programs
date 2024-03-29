/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productexceptself;

/**
 *
 * @author nayan
 */
public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        
        if (nums == null || nums.length <= 1) {
            throw new IllegalArgumentException("Input array must contain at least two elements.");
        }

        int n = nums.length;
        int[] output = new int[n];

        
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];

        
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        
        for (int i = 0; i < n; i++) {
            output[i] = leftProducts[i] * rightProducts[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] result = productExceptSelf(nums);

        System.out.print("Output array: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

