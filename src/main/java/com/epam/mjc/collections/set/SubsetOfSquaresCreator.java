package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> result = new TreeSet<>();
        if (sourceList.size() > 0) {
            for (Integer item : sourceList) {
                if (lowerBound <= item * item && item * item <= upperBound) {
                    result.add(item * item);
                }
            }
        }
        return result;
    }
}
