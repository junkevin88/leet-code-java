package jun2023.jun172023;

import java.util.Arrays;
import java.util.TreeSet;

class MakeArrayStrictlyIncreasing {
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.stream(arr2).boxed().toList());
        int[] dp = new int[arr2.length+1];
        dp[0]=-1;
        int INF = (int)2e9;
        for (int k : arr1) {
            for (int j = arr2.length; j >= 0; j--) {
                int a = k > dp[j] ? k : INF;
                Integer b = set.higher(j == 0 ? INF : dp[j - 1]);
                dp[j] = Math.min(a, b == null ? INF : b);
            }
        }
        for (int i = 0; i <= arr2.length; i++) if (dp[i] != INF){
            return i;
        }
        return -1;
    }
}