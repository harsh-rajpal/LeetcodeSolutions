package Subarray_divisible_by_k;


public class Solution {
    public int subarrayDivByK(int[] nums, int k){
        int[] count = new int[k];
        count[0] = 1;
        int sum = 0;
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int mod = (sum % k + k) % k;
            ans += count[mod];
            count[mod]++;
        }
        return ans;
    }
    
}

//Algorithm
// 1. Create a count array of size k and initialize all elements as 0.
// 2. Initialize sum of elements as 0 and count of subarrays as 0.
// 3. Iterate through the array and for every element arr[i], do following.
//     a) Increment sum by arr[i].
//     b) If k is non-zero, then update sum as sum = sum % k.
//     c) Increment count of current sum.
//     d) Add count[sub_sum] to the result.
//     e) Increment count[sub_sum] by 1.
// 4. Return result.

//Time Complexity: O(n)
//Space Complexity: O(k)

