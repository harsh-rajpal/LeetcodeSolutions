class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        int[] ans = new int[n];
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        int[] count = new int[n];
        int[] dist = new int[n];
        dfs(graph, 0, -1, count, dist);
        dfs2(graph, 0, -1, count, dist);
        return dist;
    }
    
    private void dfs(List<List<Integer>> graph, int node, int parent, int[] count, int[] dist) {
        for (int child : graph.get(node)) {
            if (child == parent) {
                continue;
            }
            dfs(graph, child, node, count, dist);
            count[node] += count[child];
            dist[node] += dist[child] + count[child];
        }
        count[node]++;
    }
    
    private void dfs2(List<List<Integer>> graph, int node, int parent, int[] count, int[] dist) {
        for (int child : graph.get(node)) {
            if (child == parent) {
                continue;
            }
            dist[child] = dist[node] - count[child] + count.length - count[child];
            dfs2(graph, child, node, count, dist);
        }
    }
}