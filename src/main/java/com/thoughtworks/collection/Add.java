package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if (rightBorder < leftBorder) {
            return getSumOfEvens(rightBorder, leftBorder);
        }
        return IntStream.rangeClosed(leftBorder, rightBorder).filter(x -> x % 2 == 0).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if (rightBorder < leftBorder) {
            return getSumOfOdds(rightBorder, leftBorder);
        }
        return IntStream.rangeClosed(leftBorder, rightBorder).filter(x -> x % 2 != 0).sum();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(x -> x).map(x -> (x * 3 + 2)).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<>(arrayList);
        IntStream.range(0, list.size()).filter(i -> list.get(i) % 2 != 0).forEach(i -> list.set(i, list.get(i) * 3 + 2));
        return list;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(x -> x).filter(x -> x % 2 != 0).map(x -> (x * 3 + 5)).sum();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
