package CTDLGTBUOI14;

public class Q1672 {
    public int maximumWealth(int[][] accounts){
        int res = 0;
        for(int[] customer : accounts){
            int sum = 0;
            for (int account : customer){
                sum = sum + account;
            }
            res = Math.max(sum, res);
        }
        return res;
    }
}
