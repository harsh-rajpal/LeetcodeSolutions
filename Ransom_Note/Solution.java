package Ransom_Note;

// Given two strings ransomNote and magazine,return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.

// Example 1:

// Input:ransomNote="a",magazine="b"Output:false Example 2:

// Input:ransomNote="aa",magazine="ab"Output:false Example 3:

// Input:ransomNote="aa",magazine="aab"Output:true

// Constraints:

// 1<=ransomNote.length,magazine.length<=105 ransomNote and magazine consist of lowercase English letters.

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
    1. Create an array of size 26 to store the frequency of each character in magazine.
    2. Traverse through the magazine string and increment the frequency of each character in the array.
    3. Traverse through the ransomNote string and decrement the frequency of each character in the array.
    4. If the frequency of any character in the array becomes negative, return false.
    5. Return true.

    //Time Complexity: O(n+m) where n is the length of ransomNote and m is the length of magazine.



    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canConstruct("aa", "aab"));
    }
    
}
