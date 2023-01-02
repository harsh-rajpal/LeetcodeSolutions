package Detect_Capital;
public class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 0) {
            return true;
        }
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) > 64 && word.charAt(i) < 91) {
                counter++;
            }
        }
        if (counter == word.length() || counter == 0) {
            return true;
        }
        if (counter == 1 && word.charAt(0) > 64 && word.charAt(0) < 91) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String word = "ffffffffffffffffffffF";
        boolean result = solution.detectCapitalUse(word);
        System.out.println(result);
    }
    
}
