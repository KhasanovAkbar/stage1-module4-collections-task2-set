package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> result = new LinkedHashSet<>();
        if (sourceList.size() > 0) {
            for (Integer item : sourceList) {
                if (item % 2 == 1) {
                    result.add(item);
                    result.add(item * 2);
                } else {
                    result.add(item);
                    while (item / 2 != 1) {
                        result.add(item / 2);
                        item /= 2;

                    }
                    result.add(item / 2);
                }
            }
        }
        return result;
    }
}
