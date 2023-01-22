package Palindrome_Partioning;

public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        dfs(s, 0, path, res);
        return res;

    }

    private void dfs(String s, int index, List<String> path, List<List<String>> res) {
        if (index == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                path.add(s.substring(index, i + 1));
                dfs(s, i + 1, path, res);
                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}

//Algorithm:
// 1. Use DFS to traverse all the possible partitions.
// 2. Use a helper function to check if the current substring is a palindrome.
// 3. If the current substring is a palindrome, add it to the path and continue to traverse the rest of the string.
// 4. If the current substring is not a palindrome, do not add it to the path and continue to traverse the rest of the string.
// 5. If the current index is equal to the length of the string, add the current path to the result.
// 6. After the traversal is completed, return the result.

//Complexity Analysis:
//Time complexity:O(n*2^n)O(n∗2n) The time complexity of the backtracking algorithm is exponential, because in the worst case, we need to add n-1 separators into a string of length n, which results in 2^n2

//Space complexity:O(n)O(n) The space complexity of the backtracking algorithm is linear, because in the worst case, the depth of the recursion tree can reach nn.


