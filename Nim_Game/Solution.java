package Nim_Game;

public class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }   
}
//Algorithm:
// 1. If the number of stones is divisible by 4, then the player will lose.
// 2. If the number of stones is not divisible by 4, then the player will win.
// 3. Return the result.

//Time Complexity: O(1).
//Space Complexity: O(1).