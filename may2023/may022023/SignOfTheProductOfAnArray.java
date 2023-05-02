package may2023.may022023;

public class SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {

        int res = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                res = 0;
                break;
            } else if (nums[i] < 0) {
                res *= -1;
            }
        }

        return res;
    }
}
