package Nth_tribonacci;

public class Solution {
    public int tribonacci(int n) {
        //Recursive Approach
        // if (n == 0)
        // return 0;

        // if (n == 1 || n == 2)
        // return 1;
        // return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        //Iterative approach
        if (n == 0)
            return 0;

        if (n < 3)
            return 1;

        int x = 0, y = 1, z = 1, ans = 0;

        for (int i = 3; i <= n; i++) {
            ans = x + y + z;
            x = y;
            y = z;
            z = ans;
        }
        return ans;
    }
}
