import java.util.Arrays;

public class Q1089 {
    public static void duplicateZeros(int[] arr) {
        int[] cloneArr = new int[arr.length];
        for(int i=0, j=0; i < arr.length && j < arr.length; i++, j++) {
            if (arr[i]==0){
                cloneArr[j] = arr[i];
                j++;
            }

            if (j >= arr.length){
                break;
            }
            cloneArr[j] = arr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
