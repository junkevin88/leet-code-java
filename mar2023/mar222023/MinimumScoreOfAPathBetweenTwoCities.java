package mar2023.mar222023;

import java.util.*;

class MinimumScoreOfAPathBetweenTwoCities {
    public int minScore(int n, int[][] roads) {
        // Build adjacency list graph and compute maximum edge weight for each node
        List<int[]>[] graph = new List[n];
        int[] maxWeights = new int[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] road : roads) {
            int u = road[0] - 1, v = road[1] - 1, w = road[2];
            graph[u].add(new int[]{v, w});
            graph[v].add(new int[]{u, w});
            maxWeights[u] = Math.max(maxWeights[u], w);
            maxWeights[v] = Math.max(maxWeights[v], w);
        }
        // Dijkstra's algorithm to find minimum score path
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        pq.offer(new int[]{0, 0}); // start at node 1 with score 0
        boolean[] visited = new boolean[n];
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int node = cur[0], score = cur[1];
            if (node == n - 1) { // reached destination node n
                return score;
            }
            if (visited[node]) {
                continue; // already visited this node
            }
            visited[node] = true;
            for (int[] neighbor : graph[node]) {
                int nextNode = neighbor[0], weight = neighbor[1];
                int nextScore = Math.max(score, Math.max(maxWeights[node], maxWeights[nextNode]));
                pq.offer(new int[]{nextNode, nextScore});
            }
        }
        return -1; // no path found
    }
}
