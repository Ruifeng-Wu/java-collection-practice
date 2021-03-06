package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
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

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        return IntStream.range(0, arrayList.size() - 1)
                .mapToObj(i -> (arrayList.get(i) + arrayList.get(i + 1)) * 3)
                .collect(Collectors.toList());
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        arrayList.sort((o1, o2) -> o1 < 02 ? o1 : 02);
        int index = arrayList.size() / 2;
        return arrayList.get(index) % 2 == 0 ? arrayList.get(index) : (arrayList.get(index - 1) + arrayList.get(index + 1)) / 2;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        int sum = arrayList.stream().mapToInt(x -> x).filter(x -> x % 2 == 0).sum();
        int count = (int) arrayList.stream().mapToInt(x -> x).filter(x -> x % 2 == 0).count();
        return sum / count;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> evenList = arrayList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        return evenList.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(x -> x % 2 == 0).distinct().collect(Collectors.toList());
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) {
                    if (o1 % 2 == 0) {
                        return 1;
                    } else {
                        return -1;
                    }
                } else {
                    return compare(o2, o1);
                }
            }
        });
        return arrayList;
    }
}
