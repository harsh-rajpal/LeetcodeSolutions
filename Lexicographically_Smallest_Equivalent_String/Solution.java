package Lexicographically_Smallest_Equivalent_String;
public class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int[] parent = new int[26];
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < s1.length(); i++) {
            int p1 = find(parent, s1.charAt(i) - 'a');
            int p2 = find(parent, s2.charAt(i) - 'a');
            if (p1 < p2) {
                parent[p2] = p1;
            } else {
                parent[p1] = p2;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < baseStr.length(); i++) {
            sb.append((char) (find(parent, baseStr.charAt(i) - 'a') + 'a'));
        }
        return sb.toString();
    }

    private int find(int[] parent, int i) {
        if (parent[i] != i) {
            parent[i] = find(parent, parent[i]);
        }
        return parent[i];
    }
    
}
//Algorithm:
// 1. Initialize parent array with 26 elements, each element is its index.
// 2. Iterate through s1 and s2, find the parent of each character, if they are not the same, set the parent of the larger one to the smaller one.
// 3. Iterate through baseStr, find the parent of each character, and append the character to the result.
// 4. Return the result.
//Time Complexity: O(n), where n is the length of baseStr.
//Space Complexity: O(1), we only use constant extra space.
