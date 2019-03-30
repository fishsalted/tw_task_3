package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> result = new HashMap<>();

        for (String collection1_item : collection1) {
            Integer value = 1;
            int split_index = collection1_item.indexOf('-');
            if(split_index == -1) {
                if(-1 == (split_index = collection1_item.indexOf(':'))) {
                    if(-1 != (split_index = collection1_item.indexOf('['))) {
                        collection1_item = collection1_item.substring(0,collection1_item.length() - 1);
                    }
                }
            }
            if(split_index != -1) {
                value = Integer.parseInt(collection1_item.substring(split_index + 1));
                collection1_item = collection1_item.substring(0, split_index);
            }
            if(result.containsKey(collection1_item)) {
                value += result.get(collection1_item);
            }
            result.put(collection1_item, value);
        }

        return result;
    }
}
