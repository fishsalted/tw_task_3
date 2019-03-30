package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> object_list = object.get("value");

        for (String list_item : object_list) {
            if(collectionA.containsKey(list_item)) {
                collectionA.put(list_item, collectionA.get(list_item) - 1);
            }
        }
        //实现练习要求，并改写该行代码。

        return collectionA;
    }
}
