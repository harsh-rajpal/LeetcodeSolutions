package Maximum_Ice_Cream_Bars;
import java.util.*;
public class Problem {
    
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int counter = 0;
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] <= coins) {
                counter++;
                coins -= costs[i];
            }
        }
        return counter;
    }  
}
//Algorithm: Greedy
// 1. Sort the array
// 2. Loop through the array and check if the cost of the ice cream is less than or equal to the coins
// 3. If it is, increment the counter and subtract the cost from the coins
// 4. Return the counter
//Time Complexity: O(nlogn) Space Complexity: O(1)
