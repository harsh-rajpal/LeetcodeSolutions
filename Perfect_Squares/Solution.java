package Perfect_Squares;
public class Solution {
   public int numSquares(int n) {
         int[] dp = new int[n + 1];
         for (int i = 1; i <= n; i++) {
              dp[i] = i;
              for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
              }
         }
         return dp[n];
   }
}



//Algorithm

// 1. Create an array of size n+1 and initialize all elements to 0.

// 2. Iterate from 1 to n and for each number i, find the minimum number of perfect squares that sum to i.

// 3. For each number i, iterate from 1 to sqrt(i) and for each j, check if adding a perfect square (j*j) to the number of perfect squares that sum to i-j*j gives a smaller number of perfect squares that sum to i.

// 4. If yes, then update the value in the array.

// 5. Return the value in the array at index n.

//Complexity Analysis

//Time Complexity:O(n*sqrt(n))

//Space Complexity:O(n)
