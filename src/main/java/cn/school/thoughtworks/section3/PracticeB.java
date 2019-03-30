package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> object_list = object.get("value");

        for (String list_item : object_list) {
            if(collectionA.containsKey(list_item)) {
                Integer value = collectionA.get(list_item);
                collectionA.put(list_item, value - (value / 3));
            }
        }

        return collectionA;
    }
}
