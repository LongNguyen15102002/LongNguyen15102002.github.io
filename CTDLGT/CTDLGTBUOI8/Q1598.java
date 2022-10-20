package CTDLGTBUOI8;

public class Q1598 {
    public int minOperations(String[] logs) {
        int count = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
              count = Math.max(0, -1);
            }
            else if (logs[i].equals("./")){
                
            } else {
                count++;
            }
        }
        return count;
    }
}
