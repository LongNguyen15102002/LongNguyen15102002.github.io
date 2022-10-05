public class Q1662 {
    public static void main(String[] args) {
        
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder x = new StringBuilder();     
        StringBuilder y = new StringBuilder();

        for (String s: word1){
            x.append(s);
        }

        for (String s: word2){
            y.append(s);
        }
        return x.toString().equals(y.toString());
    }
}
