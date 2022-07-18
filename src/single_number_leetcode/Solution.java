package single_number_leetcode;

import java.util.HashMap;
import java.util.Map;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.

class Solution {

    //Using XOR to get the single non-repeated number.
    //Time complexity: O(N)
    //Space complexity: O(1)
    int singleNumber(int[] nums) {
        int length = nums.length;
        int result = 0;
        for (int i = 0; i < length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

    //Using Hashmap
    //Time complexity: O(N)
    //Space complexity: O(N)
    int singleNumber2(int[] nums) {
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = -1;
        for (int i = 0; i < length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int currentValue = map.get(nums[i]);
                int updatedValue = currentValue + 1;
                map.put(nums[i], updatedValue);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
            }
        }
        return result;
    }
}