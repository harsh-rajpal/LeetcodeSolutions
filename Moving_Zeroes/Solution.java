package Moving_Zeroes;
// Given an integer array nums,move all 0'sto the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

// Example 1:

// Input:nums=[0,1,0,3,12]Output:[1,3,12,0,0]Example 2:

// Input:nums=[0]Output:[0]

// Constraints:

// 1<=nums.length<=104-231<=nums[i]<=231-1
public class Solution {
    public void moveZeroes(int[] nums){
        // 1. Two pointers
        // 1.1. Initialize two pointers
        int left = 0;
        int right = 0;
        // 1.2. Iterate over the array
        while (right < nums.length) {
            // 1.3. If the current element is not 0, swap it with the element at the left pointer
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                // 1.4. Increment the left pointer
                left++;
            }
            // 1.5. Increment the right pointer
            right++;
        }
        
    }
    
}
