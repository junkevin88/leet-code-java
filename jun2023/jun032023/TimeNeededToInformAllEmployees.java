package jun2023.jun032023;

public class TimeNeededToInformAllEmployees {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int maxTime = 0;
        for (int i = 0; i < n; i++) {
            maxTime = Math.max(maxTime, dfs(i, manager, informTime));
        }
        return maxTime;
    }

    private int dfs(int node, int[] manager, int[] informTime) {
        if (manager[node] == -1) {
            return 0;
        }
        return informTime[manager[node]] + dfs(manager[node], manager, informTime);
    }
}
