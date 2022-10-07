public class Q26 {
    public static void main(String[] args) {
        
    }
    
    public int removeDuplicates(int[] nums) {
        int temp = nums[0];
        int count = 1;
        // int[] result = new int[nums.length];
        for (int i = 0 ; i < nums.length ; i++){
            if (temp != nums[i]){
                temp = nums[i];
                nums[count++] = temp;
            }
        }
        return count;
    }
}
