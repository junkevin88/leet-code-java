package mar212023;

import java.util.HashMap;
import java.util.Map;

class NumberOfZeroFilledSubarrays {
    public long zeroFilledSubarray(int[] nums) {
        long res=0;
        for(int i=0,j=0;i<nums.length;i++){
            if(nums[i]!=0) j=i+1;
            res+=i-j+1;
        }
        return res;
    }
}