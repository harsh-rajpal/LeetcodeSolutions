package Numbers_Disappeared_in_Array;

import java.util.*;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!hs.contains(i)) {
                result.add(i);
            }
        }
    }

}

//Algorithm:
// 1. Create a HashSet
// 2. Create a List
// 3. Add all the elements of the array to the HashSet
// 4. Iterate from 1 to the length of the array
// 5. If the HashSet does not contain the number, add it to the List
// 6. Return the List

//Time Complexity: O(n)
//Space Complexity: O(n)