package may2023.may062023;

import java.util.Arrays;

public class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {
    public int numSubseq(int[] nums, int target) {

            int res = 0;
            int mod = (int) 1e9 + 7;
            int len = nums.length;
            int[] pow = new int[len];
            pow[0] = 1;

            for (int i = 1; i < len; i++) {
                pow[i] = (pow[i - 1] * 2) % mod;
            }

            int left = 0;
            int right = len - 1;

            Arrays.sort(nums);

            while (left <= right) {
                if (nums[left] + nums[right] > target) {
                    right--;
                } else {
                    res = (res + pow[right - left]) % mod;
                    left++;
                }
            }

            return res;

    }
}
