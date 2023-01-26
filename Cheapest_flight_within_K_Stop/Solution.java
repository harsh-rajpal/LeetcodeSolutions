class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        int[][] dp = new int[k+2][n];
        for(int i=0; i<k+2; i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[0][src] = 0;
        for(int i=1; i<k+2; i++){
            for(int[] flight: flights){
                int from = flight[0];
                int to = flight[1];
                int price = flight[2];
                if(dp[i-1][from] != Integer.MAX_VALUE){
                    dp[i][to] = Math.min(dp[i][to], dp[i-1][from] + price);
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i=1; i<k+2; i++){
            res = Math.min(res, dp[i][dst]);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}

//Algorithm
1. Create a 2D array of size (k+2) * n
2. Fill the first row with 0 and rest with Integer.MAX_VALUE
3. Iterate over the flights array and update the dp array
4. Return the minimum value in the last row

//Time Complexity: O(n^2)
//Space Complexity: O(n^2)
