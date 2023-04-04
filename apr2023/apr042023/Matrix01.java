package apr2023.apr042023;

public class Matrix01 {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    ans[i][j] = 0;
                } else {
                    ans[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0) {
                    ans[i][j] = Math.min(ans[i][j], ans[i - 1][j] + 1);
                }
                if (j > 0) {
                    ans[i][j] = Math.min(ans[i][j], ans[i][j - 1] + 1);
                }
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i < m - 1) {
                    ans[i][j] = Math.min(ans[i][j], ans[i + 1][j] + 1);
                }
                if (j < n - 1) {
                    ans[i][j] = Math.min(ans[i][j], ans[i][j + 1] + 1);
                }
            }
        }
        return ans;

    }
}
