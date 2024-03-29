/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.twosum;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author nayan
 */

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
       
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
          
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            map.put(nums[i], i);
        }
        
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = twoSum(nums, target);
        if (indices.length == 2) {
            System.out.println("Indices of the two numbers that add up to " + target + ": [" + indices[0] + ", " + indices[1] + "]");
        } else {
            System.out.println("No two numbers found that add up to " + target);
        }
    }
}

