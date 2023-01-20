package Non-decreasing-subseq;
public class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(nums, 0, path, res);
        return res;
    }

    private void dfs(int[] nums, int start, List<Integer> path, List<List<Integer>> res) {
        if (path.size() >= 2) {
            res.add(new ArrayList<>(path));
        }
        Set<Integer> set = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;
            }
            if (path.size() == 0 || nums[i] >= path.get(path.size() - 1)) {
                set.add(nums[i]);
                path.add(nums[i]);
                dfs(nums, i + 1, path, res);
                path.remove(path.size() - 1);
            }
        }
    }
    
}

//Algorithm
// 1. Use a set to avoid duplicates.
// 2. Use a path to store the current path.
// 3. Use a res to store the result.
// 4. Use a dfs function to traverse the array.
// 5. If the path size is greater than or equal to 2, add the path to the result.
// 6. If the set contains the current element, continue.
// 7. If the path size is 0 or the current element is greater than or equal to the last element in the path, add the current element to the path and the set, and then call the dfs function recursively.
// 8. Remove the last element in the path.

//Complexity Analysis
//Time complexity:O(2^n)
//Space complexity:O(n)
