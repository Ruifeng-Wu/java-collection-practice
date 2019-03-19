package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
        return arrayList.size() % 2 == 0 ? (arrayList.get(index) + arrayList.get(index - 1)) / 2.0 : arrayList.get(index);
    }

    public int getFirstEven() {
        return arrayList.stream().filter(x -> x % 2 == 0).findFirst().get();
    }

    public int getIndexOfFirstEven() {
        int firstEvenIndex = IntStream.range(0, arrayList.size()).filter(i -> arrayList.get(i) % 2 == 0).findFirst().orElse(0);
        return firstEvenIndex;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if (this.arrayList.size() != arrayList.size()) {
            return false;
        }
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (!this.arrayList.get(i).equals(arrayList.get(i))) {
                return false;
            }

        }
        return true;
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        throw new NotImplementedException();
    }
}
