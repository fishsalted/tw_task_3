package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> result = new ArrayList<>();
        Set<String> collection2_set = new HashSet<>();

        for (List<String> collection2_item: collection2) {
            collection2_set.addAll(collection2_item);
        }

        for (String collection1_item : collection1) {
            if(collection2_set.contains(collection1_item)) {
                result.add(collection1_item);
            }
        }

        return result;
    }
}
