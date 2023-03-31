package mar312023;

public class NumberOfWaysOfCuttingAPizza {

    private int dfs(int[][] sum, int[][][] dp, int m, int n, int k) {
        if (dp[m][n][k] != 0) {
            return dp[m][n][k];
        }
        if (k == 1) {
            return sum[m][n] > 0 ? 1 : 0;
        }
        int res = 0;
        for (int i = 1; i < m; i++) {
            if (sum[i][n] > 0) {
                res = (res + dfs(sum, dp, i, n, k - 1)) % 1000000007;
            }
        }
        for (int j = 1; j < n; j++) {
            if (sum[m][j] > 0) {
                res = (res + dfs(sum, dp, m, j, k - 1)) % 1000000007;
            }
        }
        dp[m][n][k] = res;
        return res;
    }
    public int ways(String[] pizza, int k) {
        int m = pizza.length;
        int n = pizza[0].length();
        int[][] sum = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + (pizza[i - 1].charAt(j - 1) == 'A' ? 1 : 0);
            }
        }
        int[][][] dp = new int[m + 1][n + 1][k + 1];
        return dfs(sum, dp, m, n, k);

    }

}
