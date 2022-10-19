package CTDLGTBUOI7MIDTEST;

public class Q724 {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        int left_total = 0;
        for (int i = 0; i < nums.length; i++){
            if (i != 0) {
                left_total += nums[i - 1];
            }
            if (total - left_total - nums[i] == left_total){
                return i;
            }
        }
        return -1;
    }
}
