package Min_Time_to_collect_apples;


public class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        int[] parent = new int[n];
        Arrays.fill(parent, -1);
        for (int[] edge : edges) {
            parent[edge[1]] = edge[0];
        }
        int res = 0;
        for (int i = n - 1; i > 0; i--) {
            if (hasApple.get(i)) {
                res += 2;
                hasApple.set(parent[i], true);
            }
        }
        return res;
    }
}



//Algorithm:
// 1. Create an array parent of size n and initialize it with -1.
// 2. Traverse the edges array and update the parent array.
// 3. Create a variable res and initialize it with 0.
// 4. Traverse the array from n-1 to 1.
// 5. If the ith index of hasApple is true, then update the res by 2 and update the parent[i]th index of hasApple to true.


//Time Complexity: O(n)
//Space Complexity: O(n)