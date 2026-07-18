class Solution {

    List<Integer>[] graph;
    boolean[] visited;

    public int countCompleteComponents(int n, int[][] edges) {

        graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        visited = new boolean[n];

        int ans = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                int[] info = dfs(i);

                int nodes = info[0];
                int edgeCount = info[1] / 2;

                if (edgeCount == nodes * (nodes - 1) / 2)
                    ans++;
            }
        }

        return ans;
    }

    private int[] dfs(int node) {

        visited[node] = true;

        int nodes = 1;
        int edges = graph[node].size();

        for (int nei : graph[node]) {

            if (!visited[nei]) {

                int[] temp = dfs(nei);

                nodes += temp[0];
                edges += temp[1];
            }
        }

        return new int[]{nodes, edges};
    }
}