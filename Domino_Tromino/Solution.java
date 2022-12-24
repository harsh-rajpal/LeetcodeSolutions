// You have two types of tiles: a 2 x 1 domino shape and a tromino shape. You may rotate these shapes.


// Given an integer n, return the number of ways to tile an 2 x n board. Since the answer may be very large, return it modulo 109 + 7.

// In a tiling, every square must be covered by a tile. Two tilings are different if and only if there are two 4-directionally adjacent cells on the board such that exactly one of the tilings has both squares occupied by a tile.

 

// Example 1:


// Input: n = 3
// Output: 5
// Explanation: The five different ways are show above.
// Example 2:

// Input: n = 1
// Output: 1
 

// Constraints:

// 1 <= n <= 1000
package Domino_Tromino;

public class Solution {
    public int numTilings(int n) {
        long[] f = { 1, 0, 0, 0 };
        int mod = (int) 1e9 + 7;
        for (int i = 1; i <= n; ++i) {
            long[] g = new long[4];
            g[0] = (f[0] + f[1] + f[2] + f[3]) % mod;
            g[1] = (f[2] + f[3]) % mod;
            g[2] = (f[1] + f[3]) % mod;
            g[3] = f[0];
            f = g;
        }
        return (int) f[0];
    }
    
}
