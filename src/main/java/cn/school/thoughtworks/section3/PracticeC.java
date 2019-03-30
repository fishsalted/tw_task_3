package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        List<String> object_list = object.get("value");
        Map<String,Integer> collection3 = new HashMap<>();

        for (String collection1_item : collectionA) {
            Integer value = collection3.get(collection1_item);
            value = value == null ? 1 : value + 1;
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
