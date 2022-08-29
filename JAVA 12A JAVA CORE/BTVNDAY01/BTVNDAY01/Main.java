package BTVNDAY01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

 
public class Main {
    public static void main(String args[]) {
        // init map
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(101, "A");
        map.put(101, "B");
        map.put(102, "C");
        // show map
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
