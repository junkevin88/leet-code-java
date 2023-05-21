package may2023.may212023;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestBridge {
    private void dfs(int[][] grid, boolean[][] visited, int i, int j) {
        if (i < 0 || i >= grid.length ||
                j < 0 || j >= grid[0].length ||
                visited[i][j] || grid[i][j] == 0) {
            return;
        }

        visited[i][j] = true;
        grid[i][j] = 2;

        dfs(grid, visited, i + 1, j);
        dfs(grid, visited, i - 1, j);
        dfs(grid, visited, i, j + 1);
        dfs(grid, visited, i, j - 1);
    }
    public int shortestBridge(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        boolean found = false;

        for (int i = 0; i < m; i++) {
            if (found) {
                break;
            }

            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, visited, i, j);
                    found = true;
                    break;
                }
            }
        }

        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<int[]> queue = new LinkedList<>();
        int level = 0;

        for (int i = 0; i < m; i++) {
            if (found) {
                break;
            }

            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    queue.add(new int[]{i, j});
                    found = true;
                    break;
                }
            }
        }

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                int[] current = queue.poll();

                for (int[] direction : directions) {
                    int x = current[0] + direction[0];
                    int y = current[1] + direction[1];

                    if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y]) {
                        continue;
                    }

                    if (grid[x][y] == 1) {
                        return level;
                    }

                    queue.add(new int[]{x, y});
                    visited[x][y] = true;
                }
            }

            level++;
        }

        return -1;

    }
}
