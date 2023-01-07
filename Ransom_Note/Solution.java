package Ransom_Note;
public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--arr[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
    //Algorithm
    // 1. Create an array of size 26 to store the frequency of each character in magazine.
    // 2. Traverse through the magazine string and increment the frequency of each character in the array.
    // 3. Traverse through the ransomNote string and decrement the frequency of each character in the array.
    // 4. If the frequency of any character in the array becomes negative, return false.
    // 5. Return true.

    //Time Complexity: O(n+m) where n is the length of ransomNote and m is the length of magazine.



    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canConstruct("aa", "aab"));
    }
    
}
