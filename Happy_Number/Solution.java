package Happy_Number;
public class Solution {
    public boolean isHappy(int n){
        int slow = n;
        int fast = n;
        do {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        } while (slow != fast);
        return slow == 1;

        
    }
    public int squareSum(int n){
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    
}

//Algorithm:

// 1. Initialize slow and fast by n.
// 2. Do following until slow and fast meet.
// a) Move slow by one iteration: compute square of digits of slow and add them.
// b) Move fast by two iteration: compute square of digits of fast and add them.
// 3. If slow becomes 1 then return true.

// Complexity Analysis:

// Time complexity: O(logn). We need to compute the square of digits of n at most O(logn) times.

// Space complexity: O(1). We only use constant extra space.

