package CTDLGTBUOI11;

import java.util.HashMap;
import java.util.Map;

public class Q12 {
    public static String intToRoman(int num) {
        Map<Integer, String> Map = new HashMap<>();
        Map.put(1, "I");
        Map.put(5, "V");
        Map.put(4, "IV");
        Map.put(9, "IX");
        Map.put(10, "X");
        Map.put(40, "XL");
        Map.put(50, "L");
        Map.put(90, "XC");
        Map.put(100, "C");
        Map.put(400, "CD");
        Map.put(500, "D");
        Map.put(900, "CM");
        Map.put(1000, "M");

        Integer[] key = {1000, 900, 500 , 400, 100, 90, 50, 40 , 10, 9, 5, 4, 1};

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < key.length; i++){
            while (key[i] <= num){
                result.append(Map.get(key[i]));
                num -= key[i];
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(99));
    }
}
