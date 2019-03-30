package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        List<String> object_list = object.get("value");
        Map<String,Integer> collection3 = new HashMap<>();

        for (String collection1_item : collectionA) {
            Integer value = 1;
            int split_index = collection1_item.indexOf('-');
            if(split_index != -1) {
                value = Integer.parseInt(collection1_item.substring(split_index + 1));
                collection1_item = collection1_item.substring(0, split_index);
            }
            if(collection3.containsKey(collection1_item)) {
                value += collection3.get(collection1_item);
            }
            collection3.put(collection1_item, value);
        }

        for (String list_item : object_list) {
            if(collection3.containsKey(list_item)) {
                Integer value = collection3.get(list_item);
                collection3.put(list_item, value - (value / 3));
            }
        }

        return collection3;
    }
}
