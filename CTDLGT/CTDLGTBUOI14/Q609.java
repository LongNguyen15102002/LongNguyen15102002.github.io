package CTDLGTBUOI14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q609{
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> storage = new HashMap<>();
        
        for(String path: paths){
            String [] array = path.split(" ");
            String directory = array[0];

            for (int i = 1; i < array.length; i++){
                String fileName = array[i].substring(0, array[i].indexOf("("));
                String content = array[i].substring(array[i].indexOf("(") + 1, array[i].length() - 1);
                List<String> filePath = storage.getOrDefault(content, new ArrayList<>());
                filePath.add(directory + "/" + fileName);
                storage.put(content, filePath);
            }
        }
        storage.entrySet().removeIf(entry -> entry.getValue().size() < 2);
        return new ArrayList<>(storage.values());
    }
}