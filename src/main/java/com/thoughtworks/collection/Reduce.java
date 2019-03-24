package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.IntStream;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return arrayList.stream().max(Integer::compareTo).get();
    }

    public double getMinimum() {
        return arrayList.stream().min(Integer::compareTo).get();
    }

    public double getAverage() {
        return arrayList.stream().mapToInt(x -> x).average().getAsDouble();
    }

    public double getOrderedMedian() {
        int index = arrayList.size() / 2;
        return isEven(arrayList.size()) ? (arrayList.get(index) + arrayList.get(index - 1)) / 2.0 : arrayList.get(index);
    }

    public int getFirstEven() {
        return arrayList.stream().filter(x -> isEven(x)).findFirst().get();
    }

    public int getIndexOfFirstEven() {
        int firstEvenIndex = IntStream.range(0, arrayList.size()).filter(i -> arrayList.get(i) % 2 == 0).findFirst().orElse(0);
        return firstEvenIndex;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if (this.arrayList.size() != arrayList.size()) {
            return false;
        }
        return IntStream.range(0, this.arrayList.size()).allMatch(i -> this.arrayList.get(i).equals(arrayList.get(i)));
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        int index = arrayList.size() / 2;
        if (isEven(arrayList.size())) {
            return ((int) singleLink.getNode(index) + (int) singleLink.getNode(index + 1)) / 2.0;
        } else {
            return (int) singleLink.getNode(index + 1) / 1.0;
        }
    }

    public int getLastOdd() {
        int lastOdd = 0;
        for (int element : arrayList) {
            if (!isEven(element)) {
                lastOdd = element;
            }
        }
        return lastOdd;
    }

    public int getIndexOfLastOdd() {
        int lastOddIndex = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (!isEven(arrayList.get(i))) {
                lastOddIndex = i;
            }
        }
        return lastOddIndex;
    }

    public boolean isEven(int i) {
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
