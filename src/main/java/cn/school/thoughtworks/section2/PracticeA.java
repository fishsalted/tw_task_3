package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> result = new HashMap<>();

        for (String collection1_item : collection1) {
            Integer value = result.get(collection1_item);
            value = value == null ? 1 : value + 1;
            result.put(collection1_item, value);
        }

        return result;
    }
}
