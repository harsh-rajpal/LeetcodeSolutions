package Find_Town_Judge;

public class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inDegree = new int[n + 1];
        int[] outDegree = new int[n + 1];
        for (int[] t : trust) {
            outDegree[t[0]]++;
            inDegree[t[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == n - 1 && outDegree[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}

//Algorithm:
// 1. Create two arrays inDegree and outDegree.
// 2. Traverse the trust array and update the inDegree and outDegree arrays.
// 3. Traverse the inDegree array and check if the current person is the town judge.
// 4. If the current person is the town judge, return the current person.
// 5. If the town judge does not exist, return -1.

//Complexity Analysis:
//Time complexity:O(n)O(n) The time complexity is linear, because we traverse the trust array once.
//Space complexity:O(n)O(n) The space complexity is linear, because we create two arrays of size n+1.
