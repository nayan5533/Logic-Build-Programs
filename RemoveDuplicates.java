/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.removeduplicates;

/**
 *
 * @author nayan
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
      
        if (nums == null || nums.length == 0) {
            return 0;
        }

        
        int index = 1;

        
        for (int i = 1; i < nums.length; i++) {
             
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }

        
        return index;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println("Original array: [1, 1, 2]");
        int length1 = removeDuplicates(nums1);
        System.out.print("New length: " + length1 + ", Modified array: [");
        for (int i = 0; i < length1; i++) {
            System.out.print(nums1[i] + (i == length1 - 1 ? "" : ", "));
        }
        System.out.println("]");

        System.out.println("Original array: [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]");
        int length2 = removeDuplicates(nums2);
        System.out.print("New length: " + length2 + ", Modified array: [");
        for (int i = 0; i < length2; i++) {
            System.out.print(nums2[i] + (i == length2 - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}

