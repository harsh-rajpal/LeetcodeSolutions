package Number_of_nodes_insubtree;
public class Solution {

    public static void main(String[] args) {
        int[][] edges = {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
        String labels = "abaedcd";
        int[] ans = countSubTrees(7, edges, labels);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] countSubTrees(int n, int[][] edges, String labels) {
        int[] ans = new int[n];
        int[] count = new int[26];
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int[] edge : edges) {
            int x = find(parent, edge[0]);
            int y = find(parent, edge[1]);
            if (x != y) {
                parent[x] = y;
            }
        }
        for (int i = 0; i < n; i++) {
            int x = find(parent, i);
            count[labels.charAt(x) - 'a']++;
            ans[x] = count[labels.charAt(x) - 'a'];
        }
        return ans;
    }

    private static int find(int[] parent, int i) {
        if (parent[i] != i) {
            parent[i] = find(parent, parent[i]);
        }
        return parent[i];
    }

    
    
}
