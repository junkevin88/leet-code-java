package apr2023.apr062023;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    static void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static void permute(int[] nums, int start, List<List<Integer>> result){
        if(start == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < nums.length; i++){
                list.add(nums[i]);
            }
            result.add(list);
            return;
        }
        for(int i = start; i < nums.length; i++){
            swap(nums, start, i);
            permute(nums, start + 1, result);
            swap(nums, start, i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, 0, result);
        return result;




    }
}
