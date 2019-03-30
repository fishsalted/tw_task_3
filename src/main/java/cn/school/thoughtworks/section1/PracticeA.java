package cn.school.thoughtworks.section1;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> result = new ArrayList<>();
        Set<String> collection2_set = new HashSet<>(collection2);

        for (String collection1_item : collection1) {
            if(collection2_set.contains(collection1_item)) {
                result.add(collection1_item);
            }
        }

        return result;
    }
}
