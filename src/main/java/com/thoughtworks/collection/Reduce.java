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
        return IntStream.range(0, this.arrayList.size()).allMatch(i -> this.arrayList.get(i).equals(arrayList.get(i)));
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        return 0.0;
    }

    public int getLastOdd() {
        int lastOdd=0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2!=0){
                lastOdd=arrayList.get(i);
            }
        }
        return lastOdd;
    }

    public int getIndexOfLastOdd() {
        throw new NotImplementedException();
    }
}
