package Max_Points_on_Line;

public class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n < 3) {
            return n;
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int[] p1 = points[i];
            for (int j = i + 1; j < n; j++) {
                int[] p2 = points[j];
                int count = 0;
                for (int k = 0; k < n; k++) {
                    int[] p3 = points[k];
                    if ((p2[1] - p1[1]) * (p3[0] - p1[0]) == (p3[1] - p1[1]) * (p2[0] - p1[0])) {
                        count++;
                    }
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
    
}

//Algorithm
// 1. Create a variable max to store the maximum number of points on the same line.
// 2. Traverse through the points array and for each point, traverse through the points array again and for each point, traverse through the points array again and for each point, check if the three points lie on the same line.
// 3. If the three points lie on the same line, increment the count variable.
// 4. Update the max variable with the maximum of max and count.
// 5. Return max.

//Time Complexity: O(n^3) where n is the length of points array.

//Space Complexity: O(1).
