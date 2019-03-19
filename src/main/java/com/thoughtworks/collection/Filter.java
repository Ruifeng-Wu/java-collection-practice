package com.thoughtworks.collection;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        return array.stream().filter(x -> x % 2 == 0).collect(toList());
    }

    public List<Integer> filterMultipleOfThree() {
        return array.stream().filter(x -> x % 3 == 0).collect(toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        return firstList.stream().filter(x -> secondList.contains(x)).collect(toList());
    }

    public List<Integer> getDifferentElements() {
        return array.stream().distinct().collect(toList());
    }
}