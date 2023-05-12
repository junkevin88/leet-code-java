package may2023.may122023;

import java.util.Arrays;

public class SolvingQuestionsWithBrainpower {
    public long mostPoints(int[][] questions) {

        int n = questions.length;
        long[] dp = new long[n + 1];
        Arrays.fill(dp, -1);

        long max = 0;


        max = Math.max(max, solve(questions, dp, 0, n));


        return max;
    }

    public long solve(int[][] q, long[] dp, int i, int n) {
        if (i >= n) {
            return 0;
        }

        if (i == n - 1) {
            return q[i][0];
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        return dp[i] = Math.max(q[i][0] + solve(q, dp, i + q[i][1] + 1, n), solve(q, dp, i + 1, n));
    }
}
