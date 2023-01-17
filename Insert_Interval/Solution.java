package Insert_Interval;


public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] result = new int[intervals.length + 1][2];
        int i = 0;
        int j = 0;
        while(i < intervals.length && intervals[i][1] < newInterval[0]){
            result[j] = intervals[i];
            i++;
            j++;
        }
        while(i < intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result[j] = newInterval;
        j++;
        while(i < intervals.length){
            result[j] = intervals[i];
            i++;
            j++;
        }
        int[][] finalResult = new int[j][2];
        for(int k = 0; k < j; k++){
            finalResult[k] = result[k];
        }
        return finalResult;

    }
    
}

//Algorithm
// 1. Create a new array of size intervals.length + 1. This will be the final result.
// 2. Iterate through the intervals array. If the end of the current interval is less than the start of the new interval, then add the current interval to the result array and increment the index of the result array.
// 3. If the start of the current interval is less than or equal to the end of the new interval, then merge the current interval with the new interval. The start of the new interval is the minimum of the start of the current interval and the start of the new interval. The end of the new interval is the maximum of the end of the current interval and the end of the new interval. Increment the index of the intervals array.
// 4. Add the new interval to the result array and increment the index of the result array.
// 5. Add the remaining intervals to the result array.
// 6. Create a new array of size j. This will be the final result.
// 7. Copy the elements from the result array to the final result array.
// 8. Return the final result array.

//Complexity Analysis
//Time Complexity: O(n), where n is the number of intervals.
//Space Complexity: O(n), where n is the number of intervals.
