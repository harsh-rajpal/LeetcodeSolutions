package Min_Round_to_complete_tasks;

import java.util.*;

public class Solution {

    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();// Creating HashMap
        int a = 0;
        int c = 0;
        for (int i = 0; i < tasks.length; i++)// Traversing array
        {
            // Checking if the element is present
            if (hm.containsKey(tasks[i])) {
                a = hm.get(tasks[i]) + 1;
                hm.put(tasks[i], a);
                a = 0;
            } else // If element is not present then add it to the HashMap
            {
                hm.put(tasks[i], 1);
            }
        }
        // Iterating over the HashMap to count the minimum number of rounds or return -1
        // if it is not possible to complete all the tasks.
        for (int z : hm.keySet()) {
            int d = hm.get(z);
            if (d == 1) {
                return -1;
            } else if (d == 2) {
                c += 1;
            } else if (d % 3 == 0) {
                c += d / 3;
            } else {
                c += d / 3 + 1;
            }
        }
        return c;// returning the minimum number of rounds.
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        // End of the program.
    }

}
