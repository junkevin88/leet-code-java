package may2023.may282023;

import java.util.Arrays;

class MinimumCostToCutAStick {
    public int minCost(int n, int[] cuts) {
        int m = cuts.length;
        int[] newCuts = new int[m + 2];
        newCuts[0] = 0;
        newCuts[m + 1] = n;
        for (int i = 0; i < m; i++) {
            newCuts[i + 1] = cuts[i];
        }
        Arrays.sort(newCuts);
        int[][] dp = new int[m + 2][m + 2];
        for (int i = m; i >= 0; i--) {
            for (int j = i + 1; j < m + 2; j++) {
                if (j - i == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = Integer.MAX_VALUE;
                    for (int k = i + 1; k < j; k++) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j] + newCuts[j] - newCuts[i]);
                    }
                }
            }
        }
        return dp[0][m + 1];

    }
}