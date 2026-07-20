import java.util.*;

class Solution {
    static final int MOD = 1_000_000_007;

    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;

        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        int depth = dfs(1, 0, graph);

        if (depth == 0) {
            return 1;
        }

        return (int) modPow(2, depth - 1);
    }

    private int dfs(int node, int parent, List<Integer>[] graph) {
        int maxDepth = 0;

        for (int next : graph[node]) {
            if (next != parent) {
                maxDepth = Math.max(maxDepth, 1 + dfs(next, node, graph));
            }
        }

        return maxDepth;
    }

    private long modPow(long base, long exp) {
        long ans = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                ans = (ans * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }

        return ans;
    }
}