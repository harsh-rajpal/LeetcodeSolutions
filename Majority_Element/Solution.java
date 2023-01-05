package Majority_Element;

import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        // 1. HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        //Adding elements to HashMap
        for (int i = 0; i < nums.length; i++) {
            // If the element is already present in the HashMap, increment its count by 1
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            // If the element is not present in the HashMap, add it to the HashMap with count 1 
            else {
                map.put(nums[i], 1);
            }
        }
        // 2. Find the key with the highest value
        int max = 0;
        int maxKey = 0;
        // Iterate over the HashMap to find the key with the highest value
        for (Integer key : map.keySet()) {
            // If the value of the current key is greater than the value of the maxKey, update the maxKey
            if (map.get(key) > max) {
                max = map.get(key);
                maxKey = key;
            }
        }
        // Return the key with the highest value
        return maxKey;

    }

}
