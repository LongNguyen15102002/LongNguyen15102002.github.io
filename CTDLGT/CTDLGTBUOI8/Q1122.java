package CTDLGTBUOI8;

import java.util.Arrays;

public class Q1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = k; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    int tmp = arr1[k];
                    arr1[k] = arr1[j];
                    arr1[j] = tmp;
                    k++;
                }
            }
        }
        Arrays.sort(arr1, k, arr1.length); 
        return arr1;
    }
}
