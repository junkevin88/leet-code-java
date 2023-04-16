package apr2023.apr162023;

public class NumberOfWaysToFormATargetStringGivenADictionary {
    public int numWays(String[] words, String target) {
        int[][] count = new int[words[0].length()][26];
        for (int i = 0; i < words[0].length(); i++) {
            for (String word : words) {
                count[i][word.charAt(i) - 'a']++;
            }
        }
        int mod = (int) 1e9 + 7;
        int[][] dp = new int[target.length() + 1][words[0].length() + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= target.length(); i++) {
            for (int j = i; j <= words[0].length(); j++) {
                dp[i][j] = (dp[i][j - 1] + (int) ((long) dp[i - 1][j - 1] * count[j - 1][target.charAt(i - 1) - 'a'] % mod)) % mod;
            }
        }
        return dp[target.length()][words[0].length()];
    }

}
