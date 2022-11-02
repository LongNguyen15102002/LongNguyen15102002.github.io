package CTDLGTBUOI14;

import java.util.ArrayList;
import java.util.List;

public class Q442 {
    public List<Integer> findDuplicates(int[] nums){
        List<Integer> outputArr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                outputArr.add(index + 1);
            }
            nums[index] = -nums[index];
        }
        return outputArr;
    }
}
