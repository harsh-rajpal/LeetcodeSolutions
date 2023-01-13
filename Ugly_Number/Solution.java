package Ugly_Number;

public class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }
    
}

//Algorithm:
// 1. If n is less than or equal to 0, return false.
// 2. Divide n by 2 as many times as possible.
// 3. Divide n by 3 as many times as possible.
// 4. Divide n by 5 as many times as possible.
// 5. If n is equal to 1, return true, otherwise return false.

//Time Complexity: O(logn)
//Space Complexity: O(1)
