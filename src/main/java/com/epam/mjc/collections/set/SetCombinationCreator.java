package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> temp = new HashSet<>();

        Set<String> union = new HashSet<>();
        union.addAll(firstSet);
        union.addAll(secondSet);

        thirdSet.removeAll(union);

        firstSet.retainAll(secondSet);

        temp.addAll(firstSet);
        temp.addAll(thirdSet);
        return temp;
    }
}
