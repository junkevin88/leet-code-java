package mar292023;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int i = 0;
        int j = 0;
        while (i < n) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        while (j < n) {
            nums[j] = 0;
            j++;
        }

    }

}
