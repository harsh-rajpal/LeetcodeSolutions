package Letter_Combination_Of_Phone_Number;

public class Solution {
    final char[][] L = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
            { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

    public List<String> letterCombinations(String D) {
        int len = D.length();
        List<String> ans = new ArrayList<>();
        if (len == 0)
            return ans;
        bfs(0, len, new StringBuilder(), ans, D);
        return ans;
    }

    public void bfs(int pos, int len, StringBuilder sb, List<String> ans, String D) {
        if (pos == len)
            ans.add(sb.toString());
        else {
            char[] letters = L[Character.getNumericValue(D.charAt(pos))];
            for (int i = 0; i < letters.length; i++)
                bfs(pos + 1, len, new StringBuilder(sb).append(letters[i]), ans, D);
        }
    }
}

//Algorithm:
// 1. Use a queue to store the current combination of letters.
// 2. For each digit in the input string, pop the current combination from the queue, and append each letter to the combination.
// 3. Push the new combination to the queue.
// 4. Repeat step 2 and 3 until all digits are processed.

//Time Complexity: O(3^N * 4^M), where N is the number of digits in the input that maps to 3 letters (e.g. 2, 3, 4, 5, 6, 8), and M is the number of digits in the input that maps to 4 letters (e.g. 7, 9), and N+M is the total number digits in the input.
//Space Complexity: O(3^N * 4^M), since one has to keep 3^N * 4^M solutions.